package ex;

import java.util.Scanner;

public class Ex0003 {

	public static void main(String[] args) {
		
		int user = 0;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("-----------------");
			System.out.println("  1  |  2  |  3  ");
			System.out.println("-----------------");
			System.out.println(" 분식 | 한식 | 중지 ");
			System.out.println("=================");
			System.out.println("선택하세요");			
			user = scan.nextInt();	
			if (user == 3) {
				System.out.println("주문을 종료합니다. 조리를 시작합니다.");
				break;
			} else if (!(user == 1 || user == 2)) {
				System.out.println("메뉴를 잘못 골랐습니다.");
				continue;
			}
			switch (user) {
	
			case 1:
				System.out.println("음료 필요하세요?");
				break;
			case 2:
				System.out.println("반찬 필요하세요?");
				break;
			
			}
				
			}
					


	}

}
