package langPackage03;

public class _02_Hashcode {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
//		String str1 = "abc"; //100번지안에
//		String str2 = "abc"; //100번지안에
		
		System.out.println("값이 같은가? "+str1.equals(str2));
		
		System.out.println("주소가 같은가? "+(str1 == str2));
		System.out.println("헤시코드는 같은가? "+str1.hashCode());
		System.out.println("헤시코드는 같은가? "+str2.hashCode());
		System.out.println("아이덴티 헤시코드 값 "+System.identityHashCode(str1));
		System.out.println("아이덴티 헤시코드 값 "+System.identityHashCode(str2));
		

	}

}
