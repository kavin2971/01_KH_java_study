package operator03;

import java.util.Scanner;

public class Operator06 {

	public static void main(String[] args) {
		// 삼항 연산자
		// 조건식 ? 참이면 식1 : 거짓이면 식2
		
		int a = 10;
		int b = 5;
		int result = a > b ? a : b ;
		
		//System.out.println(result);
		
		//사용자로 부터 2수를 입력받아서 더 큰 숫자를 출력하시오.
		
//		Scanner scan1 = new Scanner(System.in);
//		
//		System.out.println(" ↓ 첫번째 숫자를 입력하세요 :");
//		int num1 = scan1.nextInt();
//		
//		System.out.println(" ↓ 두번째 숫자를 입력하세요 :");
//		int num2 = scan1.nextInt();
//		
//		System.out.println(num1 + " 과 " + num2 + " 중 큰 숫자는 : " + (num1 > num2 ? num1 : num2));
//				
				
				Scanner sc2 = new Scanner(System.in);
				
				System.out.println("하나의 숫자를 적어주세요");
				int num = sc2.nextInt();
				
				String str = (num%2==0) ? "짝수" : "홀수"; // 문자열은 string
			
				System.out.println(str);
				
	}
}
