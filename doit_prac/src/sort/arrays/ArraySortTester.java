package sort.arrays;

import java.util.Arrays;
import java.util.Scanner;
/* 기본 자료형 배열의 정렬(퀵 정렬)*/


// Arrays.sort 메소드를 사용하여 정렬한다(퀵 정렬)
// sort메소드는 기본 자료형의 배열을 정렬함
public class ArraySortTester {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			System.out.print("요솟수 : ");
			int num = sc.nextInt();
			int[] x = new int[num]; // 배열의 크기는 num
			
			for(int i=0; i < num; i++) {
				System.out.print("x["+i+"] : ");
				x[i] = sc.nextInt();
			}
			
			Arrays.sort(x); 		// 배열 x를 정렬한다
			
			System.out.println("오름차순으로 정렬했습니다");
			for(int i=0; i < num; i++)
				System.out.println("x["+i+"]="+x[i]);
			
			sc.close();
	}

}
