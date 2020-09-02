package basic100._15;
/*
## 문제 소개

- 구구단 시작 s 부터 f 단까지 입력 받아 아래와 같이 출력하시오
- 입력 : 2 3
- 정답 : 
2 * 1 = 2      3 * 1 = 3
2 * 2 = 4      3 * 2 = 6
2 * 3 = 6      3 * 3 = 9
2 * 4 = 8      3 * 4 = 12
2 * 5 = 10     3 * 5 = 15
2 * 6 = 12     3 * 6 = 18
2 * 7 = 14     3 * 7 = 21
2 * 8 = 16     3 * 8 = 24
2 * 9 = 18     3 * 9 = 27

반복문 (while, for)
 */
//진쓰 해설
public class Main2 {

	public static void main(String[] args) {
		int s = 2;
		int f = 5;
		// 2 ~ 5 출력
		
		// 바깥for문 = 행 카운트 / 안쪽 for문 = 열 카운트
		for(int i = 1; i <= 9; i++) {
			for (int dan = s; dan <= f; dan++) { // 단은 왼쪽부터 s ~ f까지 
				 System.out.printf("%2d *%2d =%3d ", dan, i, dan*i);
			}
			System.out.println();
		}
	}

}
