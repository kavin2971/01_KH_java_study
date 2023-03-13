package thread;

public class Thread1 {

	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		
//		thread1.test1();
//		thread1.test2();
//		thread1.test3();
		thread1.test4();		
	}
	private void test1() {
		a("#");
		b("^");
	}
	
	private void test2() {
		Thread th1 = new MyThread1();
		Thread th2 = new MyThread2();
		th2.start();
		th1.start();
	}
	//하나의 쓰레드 클래스로 여러 쓰레드 만들기
	private void test3() {
//		Thread th1 = new Thread(new Foo("&"));
//		Thread th2 = new Thread(new Foo("*"));
//		th1.start(); // start하면 바로 run 실행됨
//		th2.start();
		
		
		String[] arr= {"!", "@", "#", "$", "%", "^", "&", "*", "+"};
		
		for(int i=0; i<arr.length; i++) {
//			Thread th3 = new Thread(new Foo(arr[i])).start();;
			new Thread(new Foo(arr[i])).start();
		}
	}
	/*
	 * 쓰레드 스케줄링
	 * - OS 스케줄링에 따라 임의의 순서가 부여됨
	 * - 우선 순위 ( 1 ~ 10 ) 
	 *   10 : Thread.MAX_PRIORITY
	 *    5 : Thread.NOMAL_PRIORITY
	 *    1 : Thread.MIN_PRIORITY
	 */ 
	
	private void test4() {
		Thread th1 = new Thread(new Foo("A"));
		Thread th2 = new Thread(new Foo("B"),"쓰레드");
		Thread th3 = new Thread(new Foo("C"));
		Thread th4 = new Thread(new Foo("D"));
		Thread th5 = new Thread(new Foo("E"));
		Thread th6 = new Thread(new Foo("F"));
		Thread th7 = new Thread(new Foo("G"));
		Thread th8 = new Thread(new Foo("H"));
		Thread th9 = new Thread(new Foo("I"));
		Thread th10 = new Thread(new Foo("J"));
		
		th1.setPriority(10);
		th2.setPriority(1);
		th3.setPriority(10);
		th4.setPriority(10);
		th5.setPriority(10);
		th6.setPriority(10);
		th7.setPriority(10);
		th8.setPriority(10);
		th9.setPriority(10);
		th10.setPriority(10);
	
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		th6.start();
		th7.start();
		th8.start();
		th9.start();
		th10.start();
		
		System.out.println(Thread.currentThread().getName());
	}
	
	/*
	 * 2.쓰레드 클래스 만들기
	 *  - implements Runnable 사용 : run 오버라이딩
	 */
	
	class Foo implements Runnable {
		private String str;
		public Foo(String str) {
			this.str = str;
		}
		@Override
		public void run() {
			for(int i=0; i<10000; i++){
				System.out.print(str);
			}
		}
	}
	
	/*
	 * 1. 쓰레드 클래스 만들기
	 *  - Thread상속 : run 오버라이딩
	*/
	
	class MyThread1 extends Thread {
		@Override
		public void run() {
			a("#");
		}
	}
	class MyThread2 extends Thread {
		@Override
		public void run() {
			b("^");
		}
	}
	
//	public static void a(String str) {
	public void a(String str) {
		for(int i=0; i<300; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	
//	public static void b(String str) {
	public  void b(String str) {
		for(int i=0; i<300; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
}
