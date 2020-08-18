package basic100._3;

import java.util.Scanner;

/*	최빈수 구하기
- 가장 많이 출현한 수를 출력하시오
- ex) 1 2 2 3 1 4 2 2 4 3 5 3 2
- 정답 : 2 (5회)
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] inputNum = new int[10];
		for(int i=0; i<10; i++) {
			inputNum[i] = sc.nextInt();
		}
		sc.close();
		/*
		 사용자 inputNum 
		 1 2 2 3 1 4 2 2 4 3
		 1: 2(번)
		 2: 4
		 3: 2
		 4: 2
		 * 어떤 숫자가 몇 번 등장했는지 저장할 수 있는 자료구조가 필요하다 => 배열 사용
		 */
		
		int[] mode = new int[10];
		/*
		 index -> 출현한 수
		 index의 값 -> index(출현한 수)가 몇 번 나왔는지 저장하는 용도 : 빈도수 저장 
		"mode[3] = 5, => 3번 숫자가 5번 출현했다"
		*/
	
		// inputNum => 1 2 2 3 1 4 2 2 4 3 
		for(int i=0; i<10; i++) {
			mode[inputNum[i]]++;	
		}
		//mode[1] == 2
		//mode[2] == 4
		//mode[3] == 2
		//mode[4] == 2
		
		
		int modeNum = 0;	// 최빈수
		int modeCnt = 0;	// 최빈수가 나온 횟수
		for(int i=0; i<10; i++) {
			if(modeCnt < mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		System.out.println("최빈수는 : "+ modeNum+", cnt : "+ modeCnt);
		/*
		 	1 2 2 3 1 4 2 2 4 3 
			최빈수는 : 2, cnt : 4
		 */
	}

}
