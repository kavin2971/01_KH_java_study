package langPackage01.stringMethod;

import java.util.Scanner;

public class _02_StringEx2 {

	public static void main(String[] args) {
		//chatAt(index) : index번호에서 해당하는 문자 1개 반환
		
		Scanner scan = new Scanner(System.in);
		
		
		
		String str = "123456-3234567";
		char ch1 = str.charAt(7);
		switch(ch1) {
		case '1' : case '3':
			System.out.println("남자");
			break;
		case '2' : case '4':
			System.out.println("여자");
			break;
			default : 
				System.out.println("잘못입력");
		}

	}

}
