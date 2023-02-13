package while02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("0~100 값을 입력하면 계속 묻기, -1을 입력하면 묻기 종료");
		
		char ch = ' ';
		String grade = "";
		int score;
		while(true) {
			System.out.println("점수를 입력하세요.");
			score = scan.nextInt();
			
		
			if (score<=100 && score >=90) {
			grade = "A";
			System.out.println("입력하신 점수는 " + score +" 점이며, 등급은 "+ grade + " 등급입니다.");
			}else  if (score<90 && score >=80) {
			grade = "B";
			System.out.println("입력하신 점수는 " + score +" 점이며, 등급은 "+ grade + " 등급입니다.");
			}else if (score<80 && score >=70) {
			grade = "C";
			System.out.println("입력하신 점수는 " + score +" 점이며, 등급은 "+ grade + " 등급입니다.");
			}else if (score<70 && score >=60) {
			grade = "D";
			System.out.println("입력하신 점수는 " + score +" 점이며, 등급은 "+ grade + " 등급입니다.");
			}else if (score >=0 && score<60){
			grade = "F";
			System.out.println("입력하신 점수는 " + score +" 점이며, 등급은 "+ grade + " 등급입니다.");
			
			}if (score ==-1) { 
				System.out.println("평가를 마치겠습니다.");
				break;
			}
			

	
		}	
	
}
}
