package basic100._3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

// counting 정렬을 사용한 방법
// 출처 : st-lab.tistory.com/108
public class Main_BJ_2BufferedReader {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		// 입력값의 범위 : -4000 ~ 4000
		int[] arr = new int[8001];
		
		/*
		 * sum = 총 합계
		 * max = 최댓값
		 * min = 최솟값
		 * median = 중앙값
		 * mode = 최빈값
		 */
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		// median과 mode는 -4000~4000을 제외한 수로 초기화하면 된다.
		int median = 10000;
		int mode = 10000;
		
		for(int i=0; i<N; i++) {
			int value = Integer.parseInt(br.readLine());
			sum += value;
			arr[value + 4000]++;
			
			if(max < value)
				max = value;
			if(min > value)
				min = value;
		}
		
		// 순회
		int count = 0;	// 중앙값 빈도 누적 수
		int mode_max = 0; //최빈값의 최댓값
		
		// 이전의 동일한 최빈값이 1번만 등장했을 경우 true, 아닐경우 false
		boolean flag = false;
		
		for(int i= min + 4000; i <= max + 4000; i++) {
			if(arr[i] > 0) {
				/*
				 * <중앙값 찾기>
				 * 누적횟수가 전체 길이의 절반에 못 미친다면
				 */
				if(count < (N + 1) / 2) {
					count += arr[i];	// i값의 빈도수를 count에 누적
					median = i - 4000;
				}
				/*
				 * <최빈값 찾기>
				 * 이전 최빈값보다 현재 값의 빈도수가 더 높을 경우 */
				if(mode_max < arr[i]) {
					mode_max = arr[i];
					mode = i - 4000;
					flag = true; // 첫 등장이므로 true로 변경
				}
				// 이전 최빈값 최댓값과 동일한 경우면서 한 번만 중복되는 경우
				else if(mode_max == arr[i] && flag == true) {
					mode = i - 4000;
					flag = false;
				}
			}
		}
		
		System.out.println((int)Math.round((double)sum / N));// 산술평균
		System.out.println(median); // 중앙값
		System.out.println(mode); 	// 최빈값
		System.out.println(max - min);// 범위
	}

}
