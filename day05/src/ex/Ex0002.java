package ex;

import java.util.Scanner;

public class Ex0002 {
	
	public static void main(String[] args) {
		
			
//			Scanner scan = new Scanner(System.in);
//			System.out.print("숫자를 입력 : ");
//			int num = scan.nextInt();
//			
//			for (int i=1; i<=num; i++) {
//				if (num % i == 0) {
//					System.out.print(i+", ");
					
			Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("약수를 구하려면 숫자를 입력하시고, 종료를 원하시면 0을 입력하세요 ");
			
			int num = scan.nextInt();
			if (num == 0)
				break;
			
			for (int i=1; i<=num; i++) {
				if (num % i == 0) {
					System.out.print(i+", ");
	            }
			
            }
			System.out.println();
	    }
	}	
}
