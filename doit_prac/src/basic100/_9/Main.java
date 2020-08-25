package basic100._9;

/*
- 입력된 수의 각 자릿수 합을 구하시오
- 1242  ⇒ 정답 : 9

반복문(for, while)
*/
public class Main {

	public static void main(String[] args) {
		int inputNum = 1242;
		int accSum = 0; // 각 자릿수의 합을 누적할 변수 생성
		
		// 1242			=> 124	=> 12	=> 1
		// 1의 자리는 2	=>	4	=>	2	=> 1	-> 9
		/* 즉, 10으로 나눈 나머지 값들을 더하면 된다*/
		
		while (inputNum > 0) {
			accSum += inputNum % 10;
			inputNum /= 10;
		}
		System.out.println(accSum);
	}

}
