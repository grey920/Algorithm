package sort.quick;

import java.util.Scanner;

public class Partition {

	//배열 요소 a[idx1]과 a[idx2]의 값을 바꾼다
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; 
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	// 배열을 나눈다.
	static void partition(int[] a, int n) {
		int pl = 0;		// 왼쪽 커서
		int pr = n - 1; // 오른쪽 커서
		int x = a[n/2];	// 피벗 (가운데 위치 값)
		
		do {
			while (a[pl] < x)
				pl++;
			while (a[pr] > x)
				pr--;
			if(pl <= pr)
				swap(a, pl++, pr--); //pl++의 값과 pr--의 값을 바꾼다
		}while(pl <= pr); // 오른쪽 커서와 왼쪽 커서가 엇갈릴때까지 반복
		
		System.out.println("피벗의 값은 "+x+"입니다.");
		
		System.out.println("피벗 이하의 그룹");	//a[0] ~ a[pl-1]
		for (int i=0; i<= pl-1; i++)
			System.out.print(a[i]+" ");
		System.out.println(); 
		
		if(pl > pr + 1) {
			System.out.println("피벗과 일치하는 그룹");
			for(int i= pr+ 1; i <= pl-1; i++) {
				System.out.print(a[i]+" ");
				System.out.println();
			}
		}
		
		System.out.println("피벗 이상의 그룹");
		for(int i= pr+1; i < n; i++) {
			System.out.print(a[i] + " ");
			System.out.println();
		}
		
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열을 나눕니다.");
		System.out.println("요솟수 : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i=0; i < nx; i++) {
			System.out.println("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}
		partition(x, nx);
		sc.close();
	}
}
