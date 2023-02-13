package ifelse01;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" 0 ~ 100 사이의 점수를 입력해주세요");
		
		int score = scan.nextInt();
		
		if (score >=90 && score < 100) 
			System.out.println("합격\n장학생 입니다");	
	
		else if (score <90 && score > 70)
		System.out.println("합격");
		else if (score >= 0 && score < 70)
			System.out.println("불학격");
		else 
			System.out.println("잘못입력하셨습니다");
		
		System.out.println("모두 수고하셨습니다");
		
		if (score >= 90 ) {
			if (score >=95)
				System.out.println("A+");
			else
				System.out.println("A-");
		}else if (score >=80) {
			if(score >=85)
				System.out.println("B+");
			else
				System.out.println("B-");
			
		}
		char ch1=' ', ch2=' ';
		if (score >=90) {
			ch1 = 'A';
			if(score >=95) {
				ch2 = '+';
			}
			else if (score >=80) {
				ch1='B';
				if (score >=85)
					ch2= '+';
					else
						ch2 = '0';
//				System.out.println("당신의 학점은 " + ch1 + ch2 + " 입니다");
			}
			
		}
		}
		


	}


