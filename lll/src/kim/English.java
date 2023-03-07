package kim;

import java.util.Scanner;

public class English {

	public static void main(String[] args) {
		// 영어 단어 문제 만들어서 사용자가 정답을 맞추기
		//if switch
		Scanner scan = new Scanner(System.in);
		System.out.println("1.다음 중, 동사의 현재 분사형이 아닌 것은? ");
		System.out.println(" 1.running\n 2.eating\n 3.runs\n 4.swimmung");
		for(int i=0; i<1; i++) {
			
			int num = scan.nextInt();
		
			if(num == 4) {
				System.out.println("정답 : 4.swimmung3"
						+ "\n");
			}else {
				System.out.println("다시 시도해보세요");
				--i;
			}
		}
		System.out.println("2.다음 중, 형용사의 비교급이 아닌 것은?");
		System.out.println(" 1.taller\n 2.more beautiful\n 3.most interesting\n 4.fast");
		for(int i=0; i<1; i++) {
			
			int num = scan.nextInt();
		
			if(num == 3) {
				System.out.println("정답 : 3.most interesting\n");
			}else {
				System.out.println("다시 시도해보세요");
				--i;
			}
		}
		System.out.println("3. I'm sorry, I can't make it to the party tonight. 'make it to'의 의미는 무엇인가요?");
		System.out.println(" 1. ~을 만들다 2. ~에 도착하다 3. ~을 약속하다 4. ~을 이해하다");
		
		for(int i=0; i<1; i++) {
		
		int num = scan.nextInt();
			
			switch(num) {
		
			case 2 : 
				System.out.println("정답 : 2. ~에 도착하다 \n");
				break;
			
			default :
				System.out.println("틀렸습니다\n");
				--i;
			}
		}	
		
		System.out.println("'The cat's out of the bag'는 어떤 의미인가요?");
		System.out.println("1. 비밀이 폭로되다 2. 적어도 한쪽은 이긴다 3. 아주 간단한 일이다 4. 그것이 아주 비싸다");
		while(true) {
			int num = scan.nextInt();
			
			if(num == 1) {
				System.out.println("정답 : 1. 비밀이 폭로되다");
				break;
			}else { 
				System.out.println("오답입니다");
			}
		}
		

	}
			
}
