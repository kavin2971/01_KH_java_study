package ex1;

import java.util.Arrays;
import java.util.Scanner;

public class Asda {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("유저숫자를 입력");
		int user = scan.nextInt();
		
		int[] dice = new int[4];
		int sum = 0;
		
		for(int i=0; i<dice.length; i++) {
			dice[i] = (int)(Math.random()*6+1);
			sum = sum + dice[i];
		
		}
		System.out.println(Arrays.toString(dice));
		
		if(sum >= 20) {
			System.out.println("승리");
		}else {
			System.out.println("꽝");
		}
			

	}

}
