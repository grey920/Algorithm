package basic100._5;

import java.util.Scanner;

/*
- 대문자는 소문자로, 소문자는 대문자로 변환하시오
- helloWorlD ⇒ 정답 : HELLOwORLd

배열, for, if 활용
*/
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg = sc.next();
		sc.close();
		char[] arr = msg.toCharArray();// 문자열 객체를 char Array로 반환시켜주는 메서드를 호출한다
		System.out.print(arr);
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			// i번째 요소가 소문자인지 대문자인지 확인하는 조건식이 들어가야 함
			if (arr[i] >= 'a' && arr[i] <= 'z') {
				arr[i] = (char) (arr[i] + 'A' - 'a');// 'a' 'b' ~'z' 'A' 'B' 'C'
			} else if (arr[i] >= 'A' && arr[i] <= 'Z') {
				arr[i] = (char) (arr[i] - ('A' - 'a'));
			}
		}
		System.out.print(arr);
		/* 실행 결과 =====
		 * ImGyuwoonJung 
		 * iMgYUWOONjUNG
		 */
	}

}
