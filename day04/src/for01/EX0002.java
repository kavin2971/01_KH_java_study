package for01;

import java.util.Scanner;

public class EX0002 {

	public static void main(String[] args) {
		
	
		Scanner scan = new Scanner(System.in);
		for (int k=1; k<=3; k++) {
			System.out.println("첫번째 숫자 입력 :");
			int num3 = scan.nextInt();
			System.out.println("두번째 숫자 입력 :");
			int num4 = scan.nextInt();
			System.out.println("연산자 선택 +,-,/,*,%");
			String str = scan.next();			
			char ch = str.charAt(0);
//		// if (str.equals("+"))
//			
			if (ch=='+') 
				System.out.printf("%d %c %d = %d\n\n" , num3, ch, num4, (num3+num4));
			else if (ch=='-') 
				System.out.printf("%d %c %d = %d\n\n" , num3, ch, num4, (num3-num4));
			else if (ch=='*') 
				System.out.printf("%d %c %d = %d\n\n" , num3, ch, num4, (num3*num4));
			else if (ch=='/') 
				System.out.printf("%d %c %d = %d\n\n" , num3, ch, num4, (num3/num4));
			else if (ch=='%') 
				System.out.printf("%d %c %d = %d\n\n" , num3, ch, num4, (num3%num4));
			else System.out.println("잘못입력하였습니다.");
			
			switch (str) {
			case "+":
				System.out.println(num3 + str + num4 + "=" + (num3+num4));
				break;
			case "-":
				System.out.println(num3 + str + num4 + "=" + (num3-num4));
				break;	
			case "*":
				System.out.println(num3 + str + num4 + "=" + (num3*num4));
				break;
			case "/":
				System.out.println(num3 + str + num4 + "=" + (num3/num4));
				break;
			case "%":
				System.out.println(num3 + str + num4 + "=" + (num3%num4));
				break;
				default : 
					System.out.println("잘못입력하였습니다.");
					

					}
			}
			
			
			}
		
		
	}

