package exception01;

public class _01_Exception {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
//		int result = 5/0;
//				System.out.println(result);
//		Exception in thread "main" java.lang.ArithmeticException: / by zero
//			at exception01._01_Exception.main(_01_Exception.java:6)
		
		try { 
			int result = 5/3;
//			System.out.println(result);
			System.out.println(3);
			System.out.println(4);
		// 예외가 발생할 상황을 넣어준다	
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
			System.out.println(5);
		// 예외가 발생 했을 때 처리를 넣어준다	
		}
		System.out.println(6);

	}

}
