package basic100._16;

/*
## 문제 소개

- 다음 입력 n을 받아 아래와 같은 *을 출력하시오
- 입력 : 5
- 정답 : 
*
**
***
****
*****

반복문(while, for)
 */
// 진쓰 해설 : 규칙을 잘 찾자!!
public class Main2 {

	public static void main(String[] args) {
		// 해당하는 행의 +1만큼 별이 출력된다. => 행을 옮기는 for문과 반복자의 for문으로 중첩for문이 필요하다
		int n = 5;

		for (int i = 0; i < n; i++) { // 입력된 n행만큼 가야함
			for (int j = 0; j < i+1; j++) { // ⭐여기가 포인트! i+1 (해당하는 행의 +1만큼)️
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
