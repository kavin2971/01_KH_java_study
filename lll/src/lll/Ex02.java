package lll;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		

		Scanner scan = new Scanner(System.in);
		String[] student = new String[5];
		
		for ( int i=0; i<student.length; i++ ) {
			System.out.println(i+1+"번째 주민번호 입력");

			String jumin = scan.next();
		
		if (jumin.length() == 14 ) {
	    char gender = jumin.charAt(7);
		
			if(gender=='1'||gender=='2'||gender=='3'||gender==4) {
				
				 student[i] = jumin.substring(0,8)+"******";
			 
		}else {
		    System.out.println("잘못입력 다시입력");
		    --i;
		}
		}else {
			 System.out.println("잘못입력 다시입력");
			 --i;
		}

	}
		System.out.println("완료");
		System.out.println(Arrays.toString(student));
	}
}


