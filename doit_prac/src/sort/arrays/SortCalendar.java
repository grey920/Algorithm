package sort.arrays;

import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

import java.util.Arrays;
/* 클래스 객체 배열의 정렬(병합 정렬)*/

// 달력의 배열을 정렬
public class SortCalendar {

	public static void main(String[] args) {
		GregorianCalendar[] x = {
				new GregorianCalendar(2020, JULY, 1),
				new GregorianCalendar(1992, JANUARY, 18),
				new GregorianCalendar(1983, JUNE, 2),
		};
		
		Arrays.sort(x); // 배열 x를 오름차순으로 정렬
		
		for(int i=0; i < x.length; i++)
			System.out.printf("%04d년 %02d월 %02d일\n", 
					x[i].get(YEAR),
					x[i].get(MONTH)+1,
					x[i].get(DATE)
					);

	}

}
