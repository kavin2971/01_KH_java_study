package exception01;

public class _02_NullpointException {

	public static void main(String[] args) {
		try {
		String data = null;
		System.out.println(data.toString());
		}catch(NullPointerException e) {
			System.out.println("데이터가 들어있지 않습니다");
			System.out.println("메세지 : " +e);
		}
//		String data = null;
//		System.out.println(data.toString());
//		
//	Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toString()" because "data" is null
//		at exception01._02_NullpointException.main(_02_NullpointException.java:7)

	}

}
