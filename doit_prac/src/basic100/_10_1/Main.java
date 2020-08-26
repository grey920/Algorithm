package basic100._10_1;
/*
## 문제 소개

- 입력된 수(N)만큼 N행 N열의 형태로 연속으로 출력되는 숫자 사각형을 출력하시오
- 4
- 정답 : 
    1 2 3 4
    5 6 7 8 
    9 10 11 12
    13 14 15 16

중첩 반복문(for 혹은 while)
*/
public class Main {

	public static void main(String[] args) {
		int inputNum = 4;
		int accNum = 1;
		int[][] square = new int[inputNum][inputNum];
		for(int i=0; i<inputNum; i++) {
			for(int j=0; j < inputNum; j++) {
				square[i][j] = accNum;
				accNum++;
				System.out.print(square[i][j]+" ");
			}
			System.out.println();
		}
	}

}
