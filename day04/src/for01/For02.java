package for01;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
//		1.안녕하세요
//		3.안녕하세요
//		5.안녕하세요
//		...
		int num = 1;
		for (int i=1; i<=100; i++) {//i+=2 , i=i+2 동일한 명령.
			System.out.printf("%03d. 안녕하세요\n",num);
			num+=2;
//		for (int i=1; i<=100; i++) 
//			System.out.println(num+". 안녕하세요");
//			num+=2;			
		}
		System.out.println("----------------");
		
		for (int i=50; i>=1; i--)
		System.out.println(i+ ". 안녕");
		System.out.println("----------------");
		// 1~100 까지 합계를 구하시오.
		int sum = 0;
		int i = 0;
//		for (int i=1; i<=100; i++) 
		{
			sum = sum + i;
		}
			System.out.println(sum);
		//대괄호가 안에있는지 바깥쪽에 있는지에 따라 출력이 다르게 된다.
			System.out.println(i);
			
			//i를 출력하고자 하면 int i = 0 을 괄호 바깥으로 꺼내주면된다.
			
//			for (int j=0; j<=3; j++) {
				Scanner scan = new Scanner(System.in);
//				System.out.println("이름 입력 :");
//				String name = scan.next();
//				System.out.println("당신의 이름은 " + name + " 입니다" );
//			}
			
			for (int j=1; j<=5; j++) {
				System.out.println("첫번째 숫자 입력 :");
				int num1 = scan.nextInt();
				System.out.println("두번째 숫자 입력 :");
				int num2 = scan.nextInt();
				
				System.out.println(num1+"+"+num2+"="+(num1+num2));
			}
			
			//사용자로 부터 2숫자와 연산자를 입력받아 연산한 결과 출력 (3번반복)
			Scanner scan1 = new Scanner(System.in);
			for (int k=1; k<=2; k++) {
				System.out.println("첫번째 숫자 입력 :");
				int num3 = scan1.nextInt();
				System.out.println("두번째 숫자 입력 :");
				int num4 = scan1.nextInt();
				System.out.println("연산자 선택 +,-,/,*,%");
				String str = scan1.next();
				
				char ch = str.charAt(0);
			
				
				System.out.println(num3+str+num4);
				
			}
			
	}

	}
	
