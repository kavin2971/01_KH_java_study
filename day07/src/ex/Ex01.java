package ex;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 사용자로 부터 주민번호를 입력받아서 13자리인지 아닌지
		// 13자리가 아니면 다시 입력하세요
		// 1234561234567(13자리), 123456-1234567(14자리)
		
		Scanner sc = new Scanner(System.in);		
		String[] student = new String[5];
	
		for(int i=0; i<student.length; i++) {
			
			System.out.println(i+1 + "번째 주민번호를 입력하세요 ex)123456-1234567 :");
			
			String jumin = sc.next();
			
			if(jumin.length() == 14) {
				char gender = jumin.charAt(7);
				
				if(gender=='1' || gender=='2' || gender=='3' || gender=='4') {
					
					student[i] = jumin.substring(0,8) + "******";
					
					// continue;
				} else {
					System.out.println("잘못된 형식입니다. 다시입력하세요");
					--i;
				}	
			} else {
				System.out.println("잘못된 형식입니다. 다시입력하세요");
				--i;
			}
		}
		System.out.println("주민번호가 입력됨");
		System.out.println(Arrays.toString(student));
	}

}
