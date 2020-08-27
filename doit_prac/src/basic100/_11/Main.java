package basic100._11;
/*
- 입력된 수(N)만큼 N행 N열의 형태로 연속으로 출력되는 숫자 사각형을 출력하시오
- 4
    - 정답 : 
    1 2 3 4
    8 7 6 5 
    9 10 11 12
    16 15 14 13

중첩 반복문 (for 혹은 while), 조건문(if), 배열 
 * */
public class Main {

	public static void main(String[] args) {
		int n = 5;
		
		int arr[][] = new int [n][n];
		
		/*
		 n = 3
		 1 2 3
		 6 5 4
		 7 8 9
		 */
		
		// 핵심!!
		for(int i = 0; i < n; i++) {// 행을 만든다
			
			if(i % 2 == 0) { // 짝수행일때
				for(int j=0; j < n; j++) { // 순차적으로 올라간다
					arr[i][j] = i * n + j + 1;
				}
			}
			else { // 홀수행일때 
				for(int j = n-1; j >= 0; j--) {// 거꾸로 내려가야한다.
					arr[i][j] = i * n + n - j;
				}
			}
		}
		
		// 배열 출력
		for(int i=0; i < n; i++) {
			for(int j=0; j < n; j++) {
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}
	}

}
