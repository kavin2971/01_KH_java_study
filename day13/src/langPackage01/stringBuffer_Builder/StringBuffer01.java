package langPackage01.stringBuffer_Builder;

public class StringBuffer01 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		// equals() 를 오버라이딩 하지 않았음 : 주소가 같은가를 물어봄
		System.out.println("sb1 == sb2 ? " + (sb1 == sb2));
		System.out.println("sb.equals(sb2) ?" + sb1.equals(sb2));
		
		sb2 = sb1.append("def");
	

		System.out.println("sb1 : " +sb1);
		sb1.append("...알파벳");
		System.out.println("sb1 : " +sb1);
		
	// 문자열이 같은가를 비교할 때는 String으로 변환하여 비교하는것이 편함
		String str = sb1.toString();
	 // String str = new String(sb1); 위와 동일
		String str2 = sb2.toString();
		System.out.println(str.equals(str2));
		
		System.out.println(sb1);
		System.out.println(sb2);
		

	}

}
