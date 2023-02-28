package exception01;

public class _09_Throws {

	public static void main(String[] args) {
		try {
			findClass();
			System.out.println("클래스 있음");
		} catch (ClassNotFoundException e) {

			System.out.println(e.getMessage()+" 클래스 없음");
			//			e.printStackTrace();
		}

	}
	static void findClass() throws ClassNotFoundException {
		Class class2 = Class.forName("java.lang.String2");
	}

}
