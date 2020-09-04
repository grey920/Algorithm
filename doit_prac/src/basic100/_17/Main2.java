package basic100._17;
/*
## 문제 소개

- 다음 입력 n을 받아 아래와 같은 *을 출력하시오
- 입력 : 5
- 정답 : 
*****
 ****
  ***
   **
    *

반복문(while, for), if
 */
// 진쓰 해설
public class Main2 {

	public static void main(String[] args) {
		// 규칙 : 행 이동하는 것 1, 별이나 공백을 찍는 열 1가 필요 
		int n = 5;
		
		for (int i=0; i < n; i++) { // 행
			for(int j=0; j < n; j++) {// 열 : j도 n까지 간다. 왜? 공백이든, 별이든 일단 찍기는 다 찍기 때문에
				if(j < i) {//Point! 1.행과 열의 연관이 있는 i와 j가 필요하다 
					System.out.print(" ");
				}else
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
