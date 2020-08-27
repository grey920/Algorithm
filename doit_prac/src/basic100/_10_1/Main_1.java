package basic100._10_1;

public class Main_1 {
	//진쓰ver.
	public static void main(String[] args) {

		int n = 3;
		
		/* n = 3
		 * 1 2 3
		 * 4 5 6 
		 * 7 8 9
		 */
		//int num = 1;
		
		for(int j = 0; j < n; j++) {// 행을 돌아다니는 애
			
			for(int i=0; i < n; i++) {// 열을 돌아다니는 애
				System.out.printf("%4d", j*n + i + 1); // 앞에 공백을 4 넣음
										//j*n+1하면 행마다 앞번호를 만들 수 있다.
			}
			System.out.println();
		}
	}

}
