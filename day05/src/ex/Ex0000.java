package ex;

import java.util.Scanner;

public class Ex0000 {

	public static void main(String[] args) {
		
		int random = (int)(Math.random()*6+1);
			
		
		Scanner scan = new Scanner(System.in);
		
		for (;;) {
		
		System.out.println("컴퓨터의 주사위 값을 맞춰보세요\n");
		
		int user = scan.nextInt();
		System.out.println("입력한 주사위 값은 " + user);
		
		if (random == 6) {
			System.out.println("출력된 주사위 값은 6\n");

		}else if (random == 5) {
			System.out.println("출력된 주사위 값은 5\n");

		}else if (random == 4) {
			System.out.println("출력된 주사위 값은 4\n");

		}else if (random == 3) {
			System.out.println("출력된 주사위 값은 3\n");

		}else if (random == 2) {
			System.out.println("출력된 주사위 값은 2\n");

		}else if (random == 1) {
			System.out.println("출력된 주사위 값은 1\n");	
		}
			
		if (random == user) {
			System.out.println("정답을 맞췄습니다.\n");
		}else { 
			System.out.println("다시 한번 맞춰보세요.\n");
		}
		
		
	    if (user == -1) {
			System.out.println("횟수를 모두 사용하였습니다.\n");	
			break;
	    }

	
		
		}	
		
		
	}
	

}
