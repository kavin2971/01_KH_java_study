package thread;

import java.util.Scanner;

public class ThreadEx {
	public static void main(String[] args) {
		ThreadEx th = new ThreadEx();
		th.test1();
		System.out.println(Thread.currentThread().getName()+"End");
		
		
		
	}
	private void test1() {
		Thread th1 = new Thread(new MultiplyThread(2,1000),"2배수");
		Thread th2 = new Thread(new MultiplyThread(3,2000),"3배수");
		
		th1.start();
		th2.start();
		
		System.out.println("엔터를 치면 종료됩니다");
		new Scanner(System.in).nextLine();
		
		th1.interrupt();
		th2.interrupt();
	}
	
	
	class MultiplyThread implements Runnable {
		private int num;
		private int millis;
		
		
		public MultiplyThread(int num, int millis) {
			this.num = num;
			this.millis = millis;
		}


		@Override
		public void run() {
			String name = Thread.currentThread().getName();
			int i = 1;
			while(true) {
				try {
					System.out.println("["+name+"]"+num*i++);
					Thread.sleep(millis);
				} catch (InterruptedException e) {
					break;
				}
				
			}
		}
	}
	
}


