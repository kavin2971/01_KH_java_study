package for01;

import java.util.Scanner;

public class EXXXX {

	public static void main(String[] args) {
		
		
		int com = (int)(Math.random()*3)+1;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1.가위 2.바위 3.보 숫자를 입력하세요 : ");
		
		int user = scan.nextInt();
		
		if (com ==1)
			System.out.println("컴퓨터는 가위를 냈습니다.");
		else if (com==2)
			System.out.println("컴퓨터는 바위를 냈습니다.");
		else 
			System.out.println("컴퓨터는 보를 냈습니다.");
		
		switch (user) {
		case 1:
			System.out.println("당신은 가위를 냈습니다.");
			break;
		case 2: 
			System.out.println("당신은 바위를 냈습니다.");
			break;
		case 3:
			System.out.println("당신은 보를 냈습니다.");
		}
		
	
	
		switch (user - com) {
		case 1: case -2:
			System.out.println("사용자 승");
			break;
		case -1: case 2:
			System.out.println("컴퓨터 승");
			break;
		case 0:
			System.out.println("무승부");
		
		}
			
		
		}
		
	}
		
	
	

	
