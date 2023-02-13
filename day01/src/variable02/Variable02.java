package variable02;

public class Variable02 {

	public static void main(String[] args) {
		
		/////////////////////////////////
		int x = 10; // 정수   기본자료형 4byte             00001010
		double pi = 3.141519;  //                      0.3141419*10¹
		char ch = 'a'; //반드시 1글자만, 외따옴표 유니코드에 해당하는 숫자를 2진수로고쳐서 넣어준다
		boolean bool = false; // 또는 true, 참 거짓 true=1 false=0
		String str = "abcdef"; // 안넣어도되고 1글자이상 이어도됨 문자열을넣는다 객체형
		                       // 아스키코드로 변경하여 각 알파벳별 숫자를 2진수로 변경하여 넣는다
		//////////////////////////////////////
		
		
		System.out.println(x);
		System.out.println(pi);
		System.out.println(bool);
		System.out.println(str);
		System.out.println("--------------------------"); // 구분을 위한것
		bool = 50 > 40;
		System.out.println(bool);
		
		System.out.println("==========================");
		
		//long형은 반드시 뒤에 L자를 붙여줌 안그러면 int로 인식
		long long1 = 12345678124124L; // 대소문자 상관없이 L,l을 넣어준다
		//float형은 뒤에 f를 붙여줌
		float f1 = 45.372F;  // 대소문자 상관없이 F,f를 넣어준다
		
		
	}

}
