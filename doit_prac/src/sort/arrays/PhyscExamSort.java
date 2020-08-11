package sort.arrays;

import java.util.Arrays;
import java.util.Comparator;

// 키를 기준으로 오름차순 정렬
class PhyscExamSort {
	
	static class PhyscData{
		// 신체검사 데이터
		String name; 
		int height;
		double vision;
		
		// 생성자
		PhyscData(String name, int height, double vision){
			this.name=name; this.height=height; this.vision=vision;
		}
		
		public String toString() {
			return name + " "+ height + " "+ vision;
		}
		
		// 키 오름차순용 comparator
		static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscData>{

			@Override
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height > d2.height) ? 1 : (d1.height < d2.height) ? -1 : 0;
			}
			
		}
	}

	public static void main(String[] args) {
		PhyscData[] x = {
				new PhyscData("정겨운", 164, 1.2),
				new PhyscData("정다와", 161, 0.9),
				new PhyscData("정중기", 172, 0.4),
				new PhyscData("이미자", 158, 1.5),
				new PhyscData("손예진", 165, 1.0),
				new PhyscData("김태희", 163, 0.8),
				new PhyscData("한예슬", 174, 0.5),
		};
		
		Arrays.sort(x, 						// 배열 x를
				PhyscData.HEIGHT_ORDER		// HEIGHT_ORDER을 사용하여 정렬
				);
		
		System.out.println("* 신체 검사 리스트 *");
		System.out.println(" 이름    키    시력");
		System.out.println("===================");
		for(int i=0; i < x.length; i++)
			System.out.printf("%-6s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
	}

}
