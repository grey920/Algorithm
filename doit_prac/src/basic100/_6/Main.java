package basic100._6;

import java.util.Scanner;

/*
 *
# 문제소개

- 입력된 두 수의 최대공약수를 구하시오
- 12 18 ⇒ 정답: 6

반복문(for, while), if
*/
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요 ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		// 최대공약수는 두 수 중 작은 값보다 클 수 없다 => 대소관계를 알기위해 변수 사용
		int big, small;
		
		if(a < b) {
			big = b;
			small = a;
		}else {
			big = a;
			small = b;
		}
		int gcd = 1; //최대공약수 , 1로 초기화
		int lcm = 0;
		
		// 반복문을 돌면서 약수들을 구한다 -> i가 올라가면서 공약수를 갱신 -> 가장 큰 게 최대공약수
		for (int i=1; i <= small; i++) {
			if(big % i == 0 && small % i == 0) {
				gcd = i;
				/* 내가 푼 최소공배수 구하기 */
//				int bigS = big / i;
//				int smallS = small / i;
//				lcm = i * bigS * smallS;
				lcm = big * small / i;
			}
			
		}
		System.out.println("a : "+ a + ", b : "+ b);
		System.out.println("최대공약수는 "+gcd);
		System.out.println("최소공배수는 "+lcm);
		
		// 최소공배수??
		
	}

}
