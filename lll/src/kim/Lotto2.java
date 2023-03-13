package kim;

import java.util.HashSet;
import java.util.Set;

public class Lotto2 {

	public static void main(String[] args) {
		
		Lotto2 lt = new Lotto2();
		lt.로또추출();
		
	}
	
	private void 로또추출() {
		new Thread(new SleepThread()).start();	
	}
		
	class SleepThread implements Runnable {

			@Override
	public void run() {

		System.out.println("\n\"로또 추첨 결과\"");
		
		Set Weeklylotto = new HashSet();
		int []a = new int[6];
		
		for(int i=0; Weeklylotto.size()<6; i++) {
			
			Weeklylotto.add((int)(Math.random()*45+1));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			
			System.out.print(Weeklylotto);
		}
		
	}
		}
}
  