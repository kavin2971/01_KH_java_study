package kim;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lotto2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("구매 횟수 입력 : ");
		int num = scan.nextInt();
				for(int i=1; i<=num; i++) {
					LottoBay();
				}
				
		System.out.println("\n\"이번주 로또 결과\"");
		
		Set Weeklylotto = new HashSet();
		for(int i=0; Weeklylotto.size()<6; i++) {
			Weeklylotto.add((int)(Math.random()*45+1));
		}

		System.out.println(Weeklylotto);
		 
	}
	
    static void LottoBay() {
   
		Set lotto = new TreeSet();
			for(int i=0; lotto.size()<6; i++) {
			lotto.add((int)(Math.random()*45+1));
			}
	
			System.out.println(lotto);
    }
    
    static void WeeklyNumber() {
    	   
		Set lotto = new HashSet();
			for(int i=0; lotto.size()<6; i++) {
			lotto.add((int)(Math.random()*45+1));
			}
	
			System.out.println(lotto);
    }
	
}