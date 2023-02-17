package doWhile01;

import java.util.Scanner;

public class Dowhile02 {

	public static void main(String[] args) {
		/*
		// 1. 랜덤으로 1~100사이의 숫자를 추출
		do
		// 사용자가 랜덤숫자 맞추기
		// 정답 30 , 사용자 67 => 보다 작은 숫자로 다시 도전하세요
		//        ,       25 => 보다 큰 숫자로 다시 도전하세요
		while(정답이 아니면)	
		// 축하합니다 정답입니다
		// ?회만에 정답을 맞췄습니다
		*/
		int random = (int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		int user = 0, count = 0;
		do {
			System.out.println("1~100사이의 숫자를 넣으세요 : ");
			user = sc.nextInt();
			if(random < user) 
				System.out.println("보다 작은 숫자로 다시 도전하세요");
			
			if(random > user) 
				System.out.println("보다 큰 숫자로 다시 도전하세요");
			
			count++;			
		}while(random != user);
		System.out.println("축하합니다. 정답입니다");
		System.out.println(count + "회에 정답을 맞췄습니다");
	}
}
