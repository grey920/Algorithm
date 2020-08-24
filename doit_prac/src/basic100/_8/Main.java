package basic100._8;

import java.util.Scanner;

/*
- 입력된 수의 팩토리얼을 구하시오
- 5 ⇒ 정답 : 120

반복문 (for, while)
*/
// 겨운 스스로 버전
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int f = n;
		
		for(int i=n-1; i>0; i--) {
			f *= i;
		}
		System.out.println(f);
	}

}
