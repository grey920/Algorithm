package basic100._7;

import java.util.Scanner;

/*
- 입력된 수가 소수인지 판별하시오
- 13
- 정답 : 13은 소수입니다
*/
public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		boolean isPrimeNumber = true;
		
		/* 소수는 2와 3으로 나누어지지 않는다는 것을 이용하기*/
		if(num % 2 == 0 || num % 3 == 0) {
			isPrimeNumber = false;
		}else {
			isPrimeNumber = true;
		}
		if(num == 2 || num == 3) {
			isPrimeNumber =true;
		}
		
		if(isPrimeNumber)
			System.out.println(num+"은 소수입니다");
		else
			System.out.println(num+"은 소수가 아닙니다");
	}

}
