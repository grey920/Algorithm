package basic100._18;
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

반복문(while, for), if
*/
public class Main {

	public static void main(String[] args) {
		int num = 5;
		
		for(int i=0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				if(j < num-i-1) {
				System.out.print("0");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
