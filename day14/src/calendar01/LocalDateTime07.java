package calendar01;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTime07 {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		
		LocalDateTime startDT = LocalDateTime.of(2023,02,8,9,30,07);
		LocalDateTime endDT = LocalDateTime.of(2023,07,20,18,20,30);
	
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd-a-HH-mm-ss");
		
		System.out.println(dtf);
		System.out.println("개강 일은 : " + startDT.format(dtf));
		System.out.println("종강 일은 : " + endDT.format(dtf));
		
		if (startDT.isBefore(endDT)) {
			System.out.println("진행중입니다");
		}else if (startDT.isEqual(endDT)) {
			System.out.println("종료합니다");
		}else if (startDT.isAfter(endDT)) {
			System.out.println("종료했습니다");
		}
		
		if (today.isBefore(startDT)) {
			System.out.println("진행중입니다");
		}else if (today.isEqual(startDT)) {
			System.out.println("종료합니다");
		}else if (today.isAfter(startDT)) {
			System.out.println("종료했습니다");
		}

		LocalDate today2 = LocalDate.now();
		LocalDate endToday = LocalDate.of(2023, 07, 20);
		Period period = today2.until(endToday);
		System.out.println(period.getMonths()+"개월" + period.getDays()+ "일 남음");
		System.out.println();
		
		LocalTime endTime = LocalTime.of(18, 20, 30);
		LocalTime now = LocalTime.now();
		System.out.println("금일 강의종료 시간까지"+now.until(endDT, ChronoUnit.HOURS)+"시간남음");
		
		System.out.println("종료일까지"+today.until(endDT, ChronoUnit.HOURS)+"시간남음");
		System.out.println("종료일까지"+today.until(endDT, ChronoUnit.MONTHS)+"개월남음");
		System.out.println("종료일까지"+today.until(endDT, ChronoUnit.DAYS)+"일남음");
		
		
		Duration duration = Duration.between(now, endTime);
		System.out.println("종료까지"+duration.getSeconds()+"초 남음");
		System.out.println("종료까지"+(duration.getSeconds()/60)+"분 남음");
		System.out.println("종료까지"+((duration.getSeconds()/60)/60)+"시간 남음");
		
	    System.out.println("1년후 "+today.plusYears(1).format(dtf));
	    System.out.println("3개월후 "+today.plusMonths(3).format(dtf));
	    System.out.println("15일후 "+today.plusDays(15).format(dtf));
	    System.out.println("---------------------------");
	    System.out.println("1년전 "+today.minusYears(1).format(dtf));
	    System.out.println("3개월전 "+today.minusMonths(3).format(dtf));
	    System.out.println("15일전 "+today.minusDays(15).format(dtf));
	}

}
