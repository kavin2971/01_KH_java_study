package random02;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// 
		
		int random = (int)(Math.random()*6)+1;
		

		Scanner scan = new Scanner(System.in);
		
		for ( int i=1; i<=3; i++) {
	
			System.out.println("주사위의 숫자는 몇일까요?");
		int user = scan.nextInt();
	
			if (random == user) {
				System.out.println("정답입니다");
				break;
			}else {
			
				if(i==3) {
					System.out.println("3회 모두 틀렸습니다. 게임오버");
				}
				else {
					System.out.println("틀렸습니다. 다시 입력해주세요.");
				}
			
			}
			}
		}
		
		
		
	}


