package sort.merge;

import java.util.Scanner;

// 병합정렬 알고리즘
// 전체 시간 복잡도는 O(n log n)
/* 배열의 요소 개수가 2개 이상인 경우
 	1. 배열의 앞부분을 병합 정렬로 정렬한다
 	2. 배열의 뒷부분을 병합 정렬로 정렬한다
 	3. 배열의 앞부분과 뒷부분을 병합한다
  */
public class MergeSort {
	static int[] buff;	// 작업용 배열
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("병합 정렬");
		System.out.print("요솟수 : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i=0; i < nx; i++) {
			System.out.print("x["+i+"]: ");
			x[i] = sc.nextInt();
		}
		
		mergeSort(x, nx);	// 배열 x를 병합정렬
		
		System.out.println("오름차순으로 정렬했습니다");
		for(int i = 0; i < nx; i++)
			System.out.println("x["+i+"]= "+ x[i]);

		sc.close();
	}

	private static void mergeSort(int[] a, int n) {
		buff = new int[n];		//병합한 결과를 일시적으로 저장할 작업용 배열 생성
		__mergeSort(a, 0, n-1);	//실제로 정렬 작업을 수행할 __mergeSort()메서드를 호출하여 배열 전체를 병합 정렬한다
		buff = null;			// 작업용 배열을 해제
	}

	// a[left] ~ a[right]를 재귀적으로 병합 정렬	// left=0, right:n-1
	private static void __mergeSort(int[] a, int left, int right) {
									//a:정렬할 배열, left/right : 첫번째/마지막 요소의 인덱스
		if(left < right) {
			int i;
			int center = (left + right)/2;
			int p = 0;
			int j = 0;
			int k = left;
			
			
			__mergeSort(a, left, center);	// 배열의 앞부분 정렬
			__mergeSort(a, center+1, right);// 배열의 뒷부분 정렬
			
			// 정렬 후 병합을 수행하는 코드
			for(i=left; i<= center; i++)	// 배열의 앞부분인 a[left]~a[center]을 buff[0]~buff[center-left]에 복사한다
				buff[p++] = a[i];			// for문이 끝날 떄 p의 값은 복사한 요솟수 center-left+1이다
			
			while(i <= right && j < p)		// 배열의 뒷부분인 a[center+1]~a[right]와 buff로 복사한 배열의 앞부분 p개를 병합한 결과를 배열a에 저장한다 
				a[k++] = (buff[j] <= a[i]) ? buff[j++] : a[i++];
				
			while(j < p)
				a[k++] = buff[j++];		// 배열 buff에 남아 있는 요소를 배열 a에 복사한다
		}
	}

}
