package switchCase02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
        // 5칙 연산 (+,-,*,/,%)
		// 3개 (숫자로 2개, 문자 1개

		Scanner scan = new Scanner(System.in);
		System.out.println("1번 숫자 입력 : ");
		int num = scan.nextInt();
		
		System.out.println("2번 숫자 입력 : ");
		int num2 = scan.nextInt();
		
		System.out.println(" +, -, *, /, % 입력 : ");              //(4)
		String str = scan.next();                                 // ↓
		char chr = str.charAt(0); // 인덱스 숫자는 0번부터시작 ex) (4) +-12347
		                                                    //   01234 
		
		switch (chr) {
		    case '+' :
		    	System.out.println(num+"+"+num2+"="+(num+num2));
		    	break;
		    	
		    case '-' :
		    	System.out.println(num+"-"+num2+"="+(num-num2));
		    	break;
		    	
		    case '*' :
		    	System.out.println(num+"*"+num2+"="+(num*num2));
		    	break;
		    	
		    case '/' :
		    	System.out.printf("%d/%d=%.2f", num,num2,(double)num/num2);
		    	break;
		    	
		    case '%' :
		    	System.out.println(num+"%"+num2+"="+(num%num2));
		    	break;
			
			
//		    	Scanner scan2 = new Scanner(System.in);
//		    	System.out.println("숫자입력 : ");
//		    	int score = scan2.nextInt();
//		    	
//
//		    	if(score >=80) {
//		    		System.out.println("잘했어요");
//		    	} else if (score >=60) {
//		    		System.out.println("조금만 더연습해요");
//		    	}else
//		    		System.out.println("못했어요");
//		
		}
		
		
	
		
		
	}
}

