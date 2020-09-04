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
public class Main {

	public static void main(String[] args) {
		int n = 5;
		
		for (int i=0; i < n; i++) {
			for(int j=0; j < n; j++) {
				if(j < i) {
					System.out.print(" ");
				}else
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
