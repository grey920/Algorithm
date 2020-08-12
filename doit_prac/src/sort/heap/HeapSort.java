package sort.heap;

import java.util.Scanner;

public class HeapSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("힙 정렬");
		System.out.print("요솟수 : ");
		int nx = sc.nextInt(); // 요솟수
		int[] x = new int[nx];
		
		for(int i=0; i < nx; i++) {
			System.out.print("x["+i+"]: ");
			x[i] = sc.nextInt();
		}
		
		heapSort(x, nx); // 배열x를 힙 정렬 합니다
		
		System.out.println("오름차순으로 정렬했습니다");
		for (int i=0; i<nx; i++)
			System.out.println("x["+ i + "]="+ x[i]);
		
		sc.close();
	}

	// 요소가 n개인 배열 a를 힙 정렬하는 메소드
	private static void heapSort(int[] a, int n) {
		// 1. 배열을 힙으로 만들기
		for (int i=(n-1)/2; i >= 0; i--) //a[i]~a[n-1]를 힙으로 만들기 i는 루트
			downHeap(a, i, n-1);
			
		//2. 힙정렬 반복 수행
		for (int i= n-1; i > 0; i--) {
			swap(a, 0, i); // 가장 큰 요소(루트인 a[0])와 아직 정렬되지 않은 부분의 마지막 요소를 교환
			downHeap(a, 0, i-1);  // a[0] ~ a[i-1]을 힙으로 만듭니다
		}
	}


	// a[left] ~ a[right]를 힙으로 만듭니다 - a[left] 이외에는 모두 힙 상태라고 가정하고 a[left]를 아랫부분의 알맞은 위치로 옮겨 힙상태로 만든다
	private static void downHeap(int[] a, int left, int right) {
		int temp = a[left];	// 루트
		int child;			// 큰 값을 가진 노드
		int parent;			// 부모
		
		for (parent = left; parent < (right + 1) / 2; parent = child) {
			int cl = parent * 2 + 1;	// 왼쪽 자식
			int cr = cl + 1;			// 오른쪽 자식
			child = (cr <= right && a[cr] > a[cl]) ? cr : cl;	// 큰 값을 가진 노드를 자식에 대입
			if (temp >= a[child])
				break;
			a[parent] = a[child];
		}
		a[parent] = temp;
	}

	// 배열 요소 a[idx1]과 a[idx2]의 값을 바꿉니다
	private static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
		
	}

}
