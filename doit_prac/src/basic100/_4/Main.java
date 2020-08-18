package basic100._4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inputNum = sc.nextInt();
		sc.close();
		
		int[] bin = new int[100];// 2진수 값들을 저장할 공간
		/*
		 * 19 / 2	9 ... 1
		 * 9  / 2	4 ... 1
		 * 4  / 2	2 ... 0
		 * 2  / 2	1 ... 0
		 * 1  / 2	0 ... 1
		 *
		 *	010011 => 19 
		 */
		
		int i = 0;	// bin array의 인덱스를 카운팅하기 위한 변수
		int mok = inputNum;
		
		while(mok > 0) {
			bin[i] = mok % 2;
			mok /= 2;
			i++;
		}
		
		i--; // 마지막에 인덱스가 올라가기 때문에 하나 빼준다
		for(; i>=0; i--) {
			System.out.print(bin[i]+" ");
		}
		
	}

}
