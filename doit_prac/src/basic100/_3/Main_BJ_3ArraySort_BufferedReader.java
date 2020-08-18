package basic100._3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*	
 * 백준 : 통계학
 * N을 홀수라고 가정한다.
 * 1. 산술평균 : N개의 수들의 합을 N으로 나눈 값
 * 2. 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
 * 3. 최빈값 : N개의 수들 중 가장 많이 나타나는 값
 * 4. 범위 : N개의 수들 중 최댓값과 최솟값의 차이
 * N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오
 
 * 입력 - 첫째 줄에 수의 개수N(1<= N <= 500,000)이 주어진다. 그 다음 N개의 줄에는 정수들이 주어진다.
 *		입력되는 정수의 절댓값은 4,000을 넘지 않는다.
 *
 * 출력 - 첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
 * 		둘째 줄에는 중앙값을 출력한다.
 * 		셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
 * 		넷째 줄에는 범위를 출력한다.
 */

// Arrays.sort를 사용한 방법 => 
// 그러나 Arrays.sort()의 경우 시간복잡도가 O(NlogN)이라 비용손실이 크다.
// 카운팅 정렬은 시간복잡도 O(N)임. 
// 출처 : st-lab.tistory.com/108
public class Main_BJ_3ArraySort_BufferedReader {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[] arr = new int[N];
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			int value = Integer.parseInt(br.readLine());
			arr[i] = value;
			sum += value;
		}
		
		Arrays.sort(arr);
		
		boolean flag = false;
		int mode_max = 0;
		int mode = 10000;
		
		for(int i=0; i<N; i++) {
			int jump = 0; // 동일한 수가 나온만큼 i값 jump 시킬 변수
			int count = 1;
			int i_value = arr[i];
			
			for(int j= i+1; j<N; j++) {
				if(i_value != arr[j]) {
					break;
				}
				count++;
				jump++;
			}
			
			if(count > mode_max) {
				mode_max = count;
				mode = i_value;
				flag = true;
			}
			else if(count == mode_max && flag == true) {
				mode = i_value;
				flag = false;
			}
			
			i += jump;
		}
		
		System.out.println((int)Math.round((double)sum / N));
		System.out.println(arr[((N+1)/2)-1]); // index는 0부터 시작하므로 주의
		System.out.println(mode);
		System.out.println(arr[N - 1] - arr[0]);
	}

}
