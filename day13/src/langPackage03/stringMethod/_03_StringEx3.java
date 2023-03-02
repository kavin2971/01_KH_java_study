package langPackage03.stringMethod;

public class _03_StringEx3 {

	public static void main(String[] args) {
		//chatAt(index) : index번호에서 해당하는 문자 1개 반환
		String str = "java program";
		int index = str.indexOf("p");
		System.out.println(index);
		
		index = str.indexOf("pro");
		System.out.println(index);
		
		index = str.indexOf("por");
		System.out.println(index);
		
		if(str.indexOf("java") == -1) {
			System.out.println("자바프로그램이 아닙니다.");
		}else {
			System.out.println("정상적인 자바프로그램");
		}
		if(str.indexOf("java") < 0) {
			System.out.println("자바프로그램이 아닙니다.");
		}else {
			System.out.println("정상적인 자바프로그램");
		}
		if(str.indexOf("java") >= 0) {
			System.out.println("정상적인 자바프로그램");
		}else {
			System.out.println("자바프로그램이 아닙니다.");
		}
		
		str = "javaprogram java kimjava park java";
		index = str.lastIndexOf("java");
		System.out.println(index);
			
		
	}

}


