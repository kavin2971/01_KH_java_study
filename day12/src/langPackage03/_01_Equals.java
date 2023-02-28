package langPackage03;

public class _01_Equals {

	public static void main(String[] args) {
		
		String str = "a"; //100번지로 들어간다
		String str2 = "a"; //100번지로 들어간다
		System.out.println("str,str2 주소가 같은가? " + (str == str2));
		// 같으면 true 다르면 false
		
		String str3 = new String("a"); // 300번지
		String str4 = new String("a"); // 400번지
		System.out.println("str3,str4 주소가 같은가? " + (str3 == str4));
		// 같으면 true 다르면 false
		
		Value v1 = new Value(5); //500번지
		Value v2 = new Value(6); //600번지
		System.out.println("v1,v2 주소가 같은가? " + (v1 == v2));
		// 같으면 true 다르면 false
		System.out.println("--------------------------");
		
		//String에서는 equals를 오버라이딩 했기 때문에 값 비교가능
		if (str.equals(str2)) {
			System.out.println("str과 str2의 값이 같다");
		}else {
			System.out.println("str과 str2의 값이 다르다");
		}
		if (str3.equals(str4)) {
			System.out.println("str3과 str4의 값이 같다");
		}else {
			System.out.println("str3과 str4의 값이 다르다");
		}
		// java.lang에 있는 equals() 메소드는 주소가 같은가를 비교함
		if (v1.equals(v2)) { // 오버라이딩
			System.out.println("v1과 v2의 값이 같다");
		}else {
			System.out.println("v1과 v2의 값이 다르다");
		}

	}

}
