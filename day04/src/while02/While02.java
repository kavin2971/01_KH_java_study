package while02;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		        
		
		Scanner scan = new Scanner(System.in);
		
		//for 문의 for(;;) 와 같다
		while(true) {
			System.out.println("계속하려면 (c), 정지하려면 (q)를 넣으세요 : ");
			String user = scan.next();
			char ch = user.charAt(0);
			
			if (ch =='q') {
				System.out.println("정지합니다.");
				break;
			}else { if (ch =='c') {
				System.out.println("계속 반복합니다.");
				
			}
			
		}
		
		}
		

	}

}
