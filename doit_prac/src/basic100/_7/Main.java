package basic100._7;

import java.util.Scanner;

/*
- 입력된 수가 소수인지 판별하시오
- 13
- 정답 : 13은 소수입니다
*/
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		boolean isPrimeNumber = true;
		
		// 소수 1, 자신을 제외하고 나누어 떨어지는 약수가 있으면 -> 소수가 아님
		// 소수는 1과 자기 자신만 나누어 떨어지는 경우
		for(int i=2; i<=num/2;i++) {//어떤 수를 자기자신의 절반보다 큰 수로 나누면 항상 나누어 떨어지지 않는다
									// 즉, num-1까지가 아닌, num/2로 절반까지만 검색해도 똑같다
			// 1과 자기자신은 나누면 무조건 나누어 떨어지니까 2부터 시작하고 자기자신보다 하나 앞까지만 나눈다.
			// 소수가 아닌지 판별
			if(num % i == 0) {
				// 한번이라도 나누어 떨어지면 소수가 아닌 것! (primeNumber X) 
				// 한번이라도 여기 부분을 들어왔는지 체크할 필요가 있다 -> flag변수 사용!
				isPrimeNumber = false;
			}
		}
		if (isPrimeNumber) {
			System.out.println(num + "은 소수입니다");
		} else {
			System.out.println(num + "은 소수가 아닙니다.");
		}
	}

}
