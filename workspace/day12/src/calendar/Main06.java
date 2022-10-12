package calendar;

import java.util.Calendar;

public class Main06 {

	public static void main(String[] args) {

//		8월달 달력 만들기
		
		Calendar cal = Calendar.getInstance();
		
		int day_count = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		cal.set(Calendar.DAY_OF_MONTH,1);
		int day_first = cal.get(Calendar.DAY_OF_WEEK) - 1;
		for(int i = 0 ; i < day_first; i++) {
			System.out.print("\t");
		}
		
		int c = day_first;
		for(int i = 1 ; i <= day_count; i++) {
			c++;
			if( c > 7 ) {
				System.out.println();
				c=1;
			}
			System.out.printf("%2d\t",i);
		}
		
		
		
	}

}
