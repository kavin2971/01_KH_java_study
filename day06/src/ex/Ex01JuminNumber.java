package ex;
import java.util.Arrays;
import java.util.Scanner;

public class Ex01JuminNumber {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		String [] jumin = new String[5];
		for (int i=0; i<jumin.length; i++) {
			System.out.println(i+1+"번째 주민번호 입력 ex)891212-1234567 : ");
			jumin[i] = scan.next();
//			char dash = jumin.charAt(6);
			if (jumin[i].length() == 14) {
		    char gender = jumin[i].charAt(7);
		    if(gender=='1' || gender=='2' || gender=='3' || gender=='4') {
		    	jumin[i] = (jumin[i].substring(0,8)+"******");
//                                               ↑ 8은 포함되지않음
//				break;
//		    	continue;
			}else { 
				System.out.println("잘못된 형식입니다. 다시 입력하세요.");
			--i;
			  }
			}else {
				System.out.println("잘못된 형식입니다. 다시 입력하세요.");
				--i;
			}
	}
		System.out.println("주민번호 등록완료.");
		System.out.println(Arrays.toString(jumin));
		}
	}

