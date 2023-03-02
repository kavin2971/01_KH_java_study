package lll;

import java.util.Arrays;

public class Afsdf {

	public static void main(String[] args) {
		
		String text = "홍길동,아무개&이순신-강감찬";
		
		
		
		String[] name = text.split(",|&|-");
		
		System.out.println(Arrays.toString(name));
	}

}
