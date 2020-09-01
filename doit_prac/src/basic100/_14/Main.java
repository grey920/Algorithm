package basic100._14;

/*
## 문제 소개

- 입력된 숫자의 개수를 출력하라
- 입력 : 421314218
- 정답 : 
0: 0
1: 3
2: 2
3: 1
4: 2
5: 0
6: 0
7: 0
8: 1
9: 0

반복문 (for 혹은 while), 배열, %
*/
public class Main {

	public static void main(String[] args) {
		int inputNum = 421314218;

		int arr[] = new int[10];


		while (inputNum > 0) {
			int LO = inputNum % 10;
			for (int i = 0; i < arr.length; i++) {
				if (LO == i) {
					arr[i]++;
					inputNum /= 10;
				}
			}

		}
		
		for(int i=0; i < arr.length; i++)
			System.out.println(i + ": "+ arr[i]);

	}

}
