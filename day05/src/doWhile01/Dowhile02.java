package doWhile01;

import java.util.Scanner;

public class Dowhile02 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int computer = (int)(Math.random()*100+1);
		int user= 0;
		int usercount=0;
		
		do {
			
			System.out.println("랜덤으로 1~100 사이의 숫자를 추출");	
			user = scan.nextInt();
			
			if (user < computer) {
				System.out.println("보다 큰 숫자 입력");
			}else  if (user > computer)
				System.out.println("보다 작은 숫자 입력");
			
			 usercount++;
			
		} while (user != computer);
		System.out.println("축하합니다. 정답입니다.");
		System.out.println(usercount+" 회 만에 정답을 맞췄습니다");
  }
}