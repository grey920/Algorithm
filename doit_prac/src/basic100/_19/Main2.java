package basic100._19;
/*
## 문제소개

- 다음 입력 n의 m승의 결과를 출력하시오
- 입력 : 5 3
- 정답 : 125

반복문 (while, for)
 */
// 진쓰 해설
public class Main2 {

	public static void main(String[] args) {
		int n = 5;
		int m = 3;
		// 결과값이 나올 result 변수
		int res = 1; // 0으로 초기화하면 곱했을 때 다 0이 되기 때문에 1로 초기화
		
		for(int i = 0; i < m; i++) {
			res *= n; //m번만큼 n을 곱한 수가 저장된다.
		}
		
		System.out.println(res);
	}

}
