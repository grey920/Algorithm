package sort.merge;

// 병합에 필요한 시간 복잡도 : O(n)
public class MergeArray {

	public static void main(String[] args) {
		int[] a = {2, 4, 6, 8, 11, 13};
		int[] b = {1, 2, 3, 4, 9, 16, 21};
		int[] c = new int[13];
		
		System.out.println("두 배열의 병합");
		
		merge(a, a.length, b, b.length, c); //배열a와 b를 병합하여 c에 저장
		
		System.out.println("배열 a와 b를 병합하여 배열 c에 저장했습니다");
		System.out.println("배열 a : ");
		for(int i=0; i < a.length; i++) {
			System.out.println("a["+i+"]= "+ a[i]);
		}
		
		System.out.println("배열 b : ");
		for(int i=0; i < b.length; i++) {
			System.out.println("b["+i+"]= "+ b[i]);
		}
		
		System.out.println("배열 c : ");
		for(int i=0; i<c.length; i++)
			System.out.println("c["+i+"]= "+ c[i]);
	}

	// 정렬을 마친 배열 a, b를 병합하여 배열 c에 저장한다
	private static void merge(int[] a, int na, int[] b, int nb, int[] c) {	// na : 배열a의 크기
		int pa = 0;	// 배열a 스캔시 선택 요소의 인덱스 == 커서
		int pb = 0;
		int pc = 0;
		
		while(pa < na && pb < nb)
			c[pc++] = (a[pa] <= b[pb]) ? a[pa++] : b[pb++]; // 작은 값을 c[pc]에 저장한다
			
		while(pa < na)	// 위의 while을 통해 배열b의 모든 요소를 c로 복사하고, 배열 a에는 요소가 남아있다면 실행한다
			c[pc++] = a[pa++];	// a에 남아 있는 요소를 복사한다
		
		while(pb < nb)
			c[pc++] = b[pb++];	// b에 남아 있는 요소를 복사한다
		
	}

}
