package calender02;

import java.util.Calendar;

public class Calendar02 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println("현재년도 : " + today.get(Calendar.YEAR)+"년도");
		
		//월은 0이 1월
		System.out.println("현재 몇월 : " + (today.get(Calendar.MONTH)+1)+"월");
		
		System.out.println("오늘은 올해의 몇째 주 : " + today.get(Calendar.WEEK_OF_YEAR)+"번째 주");
		
		System.out.println("오늘은 이달의 몇째 주 : " + today.get(Calendar.WEEK_OF_MONTH)+"번째 주");
		
		System.out.println("오늘은 몇일 "+today.get(Calendar.DATE)+"일");
		System.out.println("오늘은 몇일 "+today.get(Calendar.DAY_OF_MONTH)+"일");
		System.out.println("365일중 오늘의 몇일 "+today.get(Calendar.DAY_OF_YEAR)+"일");
		
		int week = today.get(Calendar.DAY_OF_WEEK);
		System.out.println("요일(1~7, 1:일 2:월 3:화 4:수 5:목 6:금 7:토) "+today.get(Calendar.DAY_OF_WEEK));
		
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
		
		System.out.println("오전_오후(0:오전, 1:오후)  "  + today.get(Calendar.AM_PM));
		System.out.println("시간(0~11) : "  + today.get(Calendar.HOUR));
		System.out.println("시간(0~23) : "  + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 : " + today.get(Calendar.MINUTE));
		System.out.println("초 : " + today.get(Calendar.SECOND));
		System.out.println("1/1000초 : "+today.get(Calendar.MILLISECOND));
		
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
//		

	}

}
