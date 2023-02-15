package ex;

import java.util.Scanner;

public class Ex0001 {

	public static void main(String[] args) {
		// 숫자맞추기 게임
		
		int computer = (int)(Math.random()*100)+1;
		Scanner scan = new Scanner(System.in);
		int user = 0, count = 0;
		
		do {
			System.out.println("1~100사이 숫자를 입력");
			user = scan.nextInt();
			if(computer < user) 
				System.out.println("더 작은 숫자를 다시 입력");
				if(computer > user) 
					System.out.println("더 큰 숫자를 다시 입력");
				
				count++;
			
		} while (computer != user);
		System.out.println("축하합니다. 정답입니다.");
	    System.out.println(count+" 회에 정답을 맞췄습니다.");
		

		
	}

}
