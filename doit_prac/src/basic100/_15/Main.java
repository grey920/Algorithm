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
public class Main {

	public static void main(String[] args) {
		int n1 = 2;
		int n2 = 4;
		
		for( int i = 1; i <= 9; i++) {
			for (int j = 0; j <= (n2 - n1); j++) {
				if(n1 <= n2) {
					/* 첫번째 방법 */
//				System.out.print((n1+j)+" * "+(i)+" = "+ (n1+j)*i+" ");
					/* 두번째 방법*/
					System.out.printf("%2d * %d = %2d ",n1+j, i, (n1+j)*i);
				}
				
			}
			System.out.println();
		}
	}

}
