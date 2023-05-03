package kim;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LottoMain {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("🧾 로또를 몇개 출력할까요?");
		int number = scan.nextInt();
		for(int i=1; i<number; i++) {
			로또구매();
		}
		로또추출();
		로또구매();
	}
    int[] buyNumbers = 로또구매();
    int[] winningNumbers = 로또추출();
    for (int buyNumber : buyNumbers) {
        for (int winningNumber : winningNumbers) {
            if (buyNumber == winningNumber) {
                System.out.println("축하합니다! 당첨번호 " + winningNumber + "와(과) 일치합니다!");
            }
        }
    }
}

	public static void 로또추출() {
	    new Thread(new LottoMain().new SleepThread()).start();    
	}
	class SleepThread implements Runnable {
	@Override
	public void run() {	
		Scanner scan = new Scanner(System.in);
		System.out.println("");
		System.out.println("로또 당첨 번호를 보여드릴까요?" );
		System.out.println("(원한다면 1을 입력해주세요)" );
		int num = scan.nextInt();
		if (num ==1) {
		System.out.println("🎉로또당첨번호🎉");
	    Set<Integer> weeklyLotto = new HashSet<>();
	    int[] number = new int [1];
	    for (int i=0; weeklyLotto.size()<6; i++) {
	        int random = (int)(Math.random()*45+1);
	        
	        if (!weeklyLotto.contains(random)) {
	            weeklyLotto.add(random);
	            number[0] = random;
	            System.out.print("["+number[0] +"]");
	           
	            try {
	                Thread.sleep(2000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
		}
	}
	}

	}
	
	
	
}


  