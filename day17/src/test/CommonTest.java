package test;

import java.util.Scanner;

public class CommonTest {
	

	public static void main(String[] args) {	

		Scanner scan = new Scanner(System.in);
		System.out.println("두 숫자를 입력하세요");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println("입력한 숫자는 "+num1+", "+num2);
		
		Common c = new Common();
		MaxCommon maxc = new MaxCommon(); 
		MinCommon minc = new MinCommon();
		
		c.getCommon(num1);
		c.getCommon(num2);
		maxc.getMaxCommon(num1, num2);
		minc.getMinCommon(num1, num2);

		
		
		
	
	}

	

}
