package switchCase02;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
//		// 스위치 케이스 Switch case
//		
		int num = 7;
		switch(num) {  //반드시 괄호 해줘야한다.
		case 1 : //case 7: case 8: case 9: 로 입력해도된다.
////          ↑ 반드시 띄어쓰기		
			System.out.println("A반");
			break; //  <- break 수행후 빠져나간다.
		case 2 :
			System.out.println("B반"); 
			break;		
		case 3 : 
			System.out.println("C반");
			break;
		case 4 : 
			System.out.println("D반");
			break;
		default : 
			System.out.println("F반");
			
	}
		Scanner scan = new Scanner(System.in);
		System.out.println( " 1월 ~ 12월중 원하는 달의 숫자만 입력하시오 ");
		

	int month = scan.nextInt();
	
	switch (month) {
		case 12: case 1: case 2:
			System.out.println("겨울");			
			break;
			
		case 3: case 4: case 5:
            System.out.println("봄");			
			break;
		
		case 6: case 7: case 8:
            System.out.println("여름");			
			break;			
			
		case 9: case 10: case 11:	
            System.out.println("가을");			
	}
	
	Scanner scan1 = new Scanner(System.in);
	System.out.println("점수를 입력 : ");
	
	int score = scan1.nextInt();
//	int score2 = score/10;
//			char ch = ' ';
			
			
	switch (score/10) {
	case 9: case 10:	
		System.out.println("A");
		break;
		
	case 8:
        System.out.println("B");			
		break;
	
	case 7:
        System.out.println("C");			
		break;			
	case 6: 	
		System.out.println("D");
		break;
	
	default:
        System.out.println("F");			
		
     }
	
	}	
}


