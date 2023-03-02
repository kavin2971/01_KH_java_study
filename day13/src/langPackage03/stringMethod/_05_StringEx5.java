package langPackage03.stringMethod;

public class _05_StringEx5 {

	public static void main(String[] args) {
		String str = "javaprogram java kimjava parkjava";
		String newStr = str.replace("j", "'J'");
		
		System.out.println(str);
		System.out.println(newStr);
		
		newStr = str.replace("j", "oi");
		System.out.println(newStr);
		
		newStr = str.replaceFirst("a", "b");
		System.out.println(newStr);
		
		

	}

}
