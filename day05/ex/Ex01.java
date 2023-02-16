package ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 사용자로 부터 주민번호를 입력받아서 13자리인지 아닌지
		// 13자리가 아니면 다시 입력하세요
		// 1234561234567(13자리), 123456-1234567(14자리)
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("주민번호 입력 ex)123456-1234567 :");
			String  jumin = sc.next();
			char dash = jumin.charAt(6);
			if(jumin.length() == 14 && dash == '-') {
				char gender = jumin.charAt(7);
				if(gender=='1' || gender=='2' || gender=='3' || gender=='4') {
					System.out.println(jumin.substring(0,8) + "******");
					break;
				}		
			} else 
				System.out.println("잘못된 형식입니다. 다시입력하세요");
		}
		System.out.println("주민번호가 입력됨");
	}

}
