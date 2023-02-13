package for01;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		// for문 안에 for문이 들어갈수있다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 1~9단 사이의 숫자를 입력하세요");
		int num = sc.nextInt();
		System.out.println(num+"단");
		for (int i=1; i<=9; i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}
	 
		}
			

	}


