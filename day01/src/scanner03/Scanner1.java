package scanner03;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
        // S가 대문자면 클래스를 만들었구나~
		Scanner scan = new Scanner(System.in);  // 꼭외우기!
//		System.out.print("주소를 입력하세요 : ");
////		
////	String str = scan.next(); //단어단위의 문자열 //nextLine을 입력시 모든입력값을 가져옴 엔터를 칠때 까지
////	System.out.println("당신의 이름은 " + str + " 이군요!!!");
////		   
//		 //ctrl+ / ctrl+shift / 주석  (비활성화) 
//		 
//		//한줄로 읽어옴
//		String str2 = scan.nextLine();
//System.out.println("주소 : " + str2);
		
		System.out.println("첫번째 숫자를 입력하세요 : ");
		int num1 = scan.nextInt(); //두번째 단어는 대문자 next(I)nt
		System.out.println("두번째 숫자를 입력하세요");
		int num2 = scan.nextInt();
		       //        첫번째숫자 기호 두번째숫자 기호 두개의숫자계산식
		System.out.println(num1+" + "+num2+" = "+(num1+num2)); 
		System.out.println(num1+" - "+num2+" = "+(num1-num2));
		System.out.println(num1+" * "+num2+" = "+(num1*num2));
		System.out.println(num1+" / "+num2+" = "+(num1/(double)num2));
		 
		// num1+" +,-,*,/ "+num2+"="+ 소괄호안에 숫자열간 +,-,*,/
		// 소수점을 표현하기위해 double를 입력해준다
		
	}

}
