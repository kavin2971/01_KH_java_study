package calender02;

import java.util.Calendar;

public class Calendar01 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		int week = today.get(Calendar.DAY_OF_WEEK);
		
		System.out.println((today.get(Calendar.MONTH)+1)+"월 " +today.get(Calendar.DATE)+"일");
		
//		System.out.println("오전: 0, 오후: 1"+(today.get(Calendar.AM_PM)));
		
		int time = today.get(Calendar.AM_PM);
		switch(time) {
		case 0 : 
			System.out.println("오전 "+today.get(Calendar.HOUR)+"시 "+today.get(Calendar.MINUTE)+"분");
			break;
		case 1 :
			System.out.println("오후 "+today.get(Calendar.HOUR)+"시 "+today.get(Calendar.MINUTE)+"분");
		}
		
//		System.out.println("1:일, 2:월, 3:화, 4:수, 5:목, 6:금, 7:토) : "+today.get(Calendar.DAY_OF_WEEK));
		
		switch(week) {
		case 1 : 
			System.out.println("일요일");
			break;
		case 2 :
			System.out.println("월요일");
			break;
		case 3 : 
			System.out.println("화요일");
			break;
		case 4 :
			System.out.println("수요일");
			break;
		case 5 : 
			System.out.println("목요일");
			break;
		case 6 :
			System.out.println("금요일");
			break;
		case 7 : 
			System.out.println("토요일");
		}
		
//		String[] str = {"","일","월","화","수","목","금","토"};
//		System.out.println(str[today.get(Calendar.DAY_OF_WEEK)]+"요일");
		

	}

}
