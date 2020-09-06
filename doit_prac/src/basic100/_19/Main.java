package basic100._19;
/*
## 문제소개

- 다음 입력 n의 m승의 결과를 출력하시오
- 입력 : 5 3
- 정답 : 125

반복문 (while, for)
 */
public class Main {

	public static void main(String[] args) {

		int n = 5;
		int m = 3;
		int result = 1;
		// 5^3 = 5 * 5 * 5 (n을 m번 반복해서 곱하다)
		
		for(int i=0; i < m; i++) {
			result *= n;
		}
		System.out.println(result);
	}

}
