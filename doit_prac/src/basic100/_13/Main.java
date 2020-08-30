package basic100._13;

import java.util.Scanner;

/*
- 입력된 수(N)만큼 N행 N열의 형태로 아래와 같이 출력되는 숫자 사각형을 출력하시오
- 4
- 정답  :
1 2 3 4
2 4 6 8 
3 6 9 12
4 8 12 16

중첩 반복문(for 혹은 while, 배열
*/
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j < n; j++) {
				arr[i][j] = (i+1) * (j+1);
			}
		}
		
		// 출력
		for(int i=0; i < n; i++) {
			for (int j=0; j < n; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}

}
