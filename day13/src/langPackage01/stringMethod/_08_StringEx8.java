package langPackage01.stringMethod;

public class _08_StringEx8 {

	public static void main(String[] args) {
		// toLowerCase() : 모든 문자 소문자로 변환
		// toUpperCase() : 모든 문자 대문자로 변환
		String str1 = "JAVA Program";
		String strLower = str1.toLowerCase();
		System.out.println(strLower);
		
		String strUpper = str1.toUpperCase();
		System.out.println(strUpper);
		
		String str2 = strLower.substring(0,1).toUpperCase() //인덱스 위치를 찾아서 소문자를 대문자로
		+ strLower.substring(1,5) //인덱스 범위를 지정해서 소문자로
		
		+ strLower.substring(5,6).toUpperCase() //인덱스 위치를 찾아서 소문자를 대문자로
		+ strLower.substring(6); // 인덱스 6번부터 맨뒤까지 소문자로
		
		System.out.println(str2);

	}

}
