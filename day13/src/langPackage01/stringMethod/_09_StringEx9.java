package langPackage01.stringMethod;

public class _09_StringEx9 {

	public static void main(String[] args) {
		//  trim() : 앞과 뒤의 공백 제거
		
		 String str1 = "java     ";
		 String str2 = "j a v a     ";
		 
		 System.out.println(str1 + "공백제거 전");
		 System.out.println(str2+"전");
		 
		 System.out.println(str1.trim() + "공백제거 후");
		 System.out.println(str2.trim()+"전");
		 
		 
		 String str3 = "     program     ";
		 String str4 = "     입문";
		 System.out.println(str1.trim() + str2.trim() + str3.trim() + str4.trim());
		 
		 String str5 = "    java program 입문     ";
		 System.out.println(str5.trim()+ ":공백제거");
		 
		 
		 
	}

}
