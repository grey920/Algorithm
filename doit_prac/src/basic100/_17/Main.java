package basic100._17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int i = 0;
		
		while(i < n) {
			for(int j = 0; j < n; j++) {
				if(j < i) {
					System.out.print(" ");
				}else
			System.out.print("*");
			}
			System.out.println();
			i++;
		}
	}

}
