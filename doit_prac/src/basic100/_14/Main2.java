package basic100._14;

/*
## 문제 소개

- 입력된 숫자의 개수를 출력하라
- 입력 : 421314218
- 정답 : 
0: 0
1: 3
2: 2
3: 1
4: 2
5: 0
6: 0
7: 0
8: 1
9: 0

반복문 (for 혹은 while), 배열, %
*/
// 진쓰 해설 
// # 배열의 인덱스에 의미를 두고 그에 해당하는 값과 매칭하는 프로그래밍을 작성하는 것이 자주 나온다
public class Main2 {

	public static void main(String[] args) {
		int n = 421314218;	// 421314218 -> 8 추출
							// 42131421 -> 1
							// 4213142 -> 2
							// ... 몫이 0일때까지 반복

		int arr[] = new int[10]; // 0 ~ 9 입력된 수를 count하기위한 용도
		/* int arr[0] = 0; 
		 * int arr[1] = 3; // 인덱스는 나온 숫자, 값은 숫자가 나온 개수
		 * int arr[4] = 2;
		 */
		
		// 10으로 나눈 나머지를 추출한다 
		while(n > 0) {
			arr[n % 10]++;
			n /= 10;
		}

	for(int i = 0; i < 10; i++) {
		System.out.println(i + ": "+ arr[i]);
	}

	}

}