package basic100._2;

public class Main {

	public static void main(String[] args) {

		//1. array를 이용하는 방법
		int[] arr = new int[100];
		
		//An = An-1 + An-2; <-- n>3일때 만족하는 공식이다.
		//a1 = 1, a2 = 1로 초기화를 시켜놓고 시작해야 한다.
		arr[1] = 1;
		arr[2] = 1;
		
		for(int i=3; i < 100; i++) {
		arr[i] = arr[i-1] + arr[i-2];
		}
		
		// 확인하기
		for(int i=1; i <= 10; i++)
			System.out.print(arr[i]+" ");
		
		System.out.println();
		
		// 2.변수에 저장하는 방법 
		//지금 항을 구할 때 "전항과 전전항을 기억하면 된다"는 것을 이용! => 변수에 담기
		int prevPrevNum = 1;	//An-2
		int preNum = 1;			//An-1
		System.out.print(prevPrevNum+" ");
		System.out.print(preNum+" ");
		
		for(int i=3; i<=10; i++) {
			int nNum = prevPrevNum + preNum;
			System.out.print(nNum + " ");
			prevPrevNum = preNum;
			preNum = nNum;
		}
	}

}
