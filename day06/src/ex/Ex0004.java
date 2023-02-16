package ex;

import java.util.Scanner;

public class Ex0004 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		while(true) {
			
			System.out.println(" 주민번호 입력 ex)891212-1234567 : ");
			String jumin = scan.next();
			char dash = jumin.charAt(6);
			
			
				if (jumin.length() == 14 && dash == '-') {
					
					
		    char gender = jumin.charAt(7);
		    
		    
		    if(gender=='1' || gender=='2' || gender=='3' || gender=='4') {
		    	
		    	System.out.println(jumin.substring(0,8)+"******");
			
				break;
			}
			}else 
				System.out.println("잘못된 형식입니다. 다시 입력하세요.");
			
		}
		
//		System.out.println("주민번호 등록완료.");

	}

}
