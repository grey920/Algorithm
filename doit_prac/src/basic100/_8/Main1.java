package basic100._8;

/*
- 입력된 수의 팩토리얼을 구하시오
- 5 ⇒ 정답 : 120

반복문 (for, while)
*/
// 진쓰 풀이
public class Main1 {

	public static void main(String[] args) {
		
		int inputNum = 7;
		int accNum = 1; // 0이 아닌 1로 초기화하는게 중요 !
		// 계산된 결과를 어딘가에 저장해야 함
		// 5! = 5 * 4 * 3 * 2 * 1
		// 7! = 7 * 6 * 5 * 4 * 3 * 2 * 1
		
		for(int i=1; i <= inputNum; i++) {
			accNum *= i; // accNum = accNum * i;
		}
		
		System.out.println(accNum);
		
		accNum = 1; //결과값을 저장하는 역할
		for (int i= inputNum; i >= 1; i--) {
			accNum *= i;
		}
		System.out.println(accNum);
	}
}
