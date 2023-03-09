package kim;

import java.util.Scanner;

public class English {

	public static void main(String[] args) {
		// 영어 단어 문제 만들어서 사용자가 정답을 맞추기
		//if switch
		
		Scanner scan = new Scanner(System.in);
//            ↑ 스캐너를 사용해서 사용자가 값을 입력하고 scan 안에 넣기 		
		System.out.println("1.다음 중, 동사의 현재 분사형이 아닌 것은? ");
		System.out.println(" 1.running\n 2.eating\n 3.runs\n 4.swimmung");

//                   ↓ 몇번 반복할것인지		
		for(int i=0; i<1; i++) {
//			    ↑몇부터 시작할지 ↖ 1씩 더할때 사용
//       ↑	for : 반복문		
//                              ↓ 숫자형이면 Int, 문자형이면 scan.next()			
			int num = scan.nextInt();
//               ↑ 사용자가 입력한 값을 num에 넣기		

//      			↓ 사용자가 입력한 값을 num에 넣고 그값이 "4와 같으면" 이라는 조건
			if(num == 4) {
//		     ↑	if : 조건문				
				System.out.println("정답 : 4.swimmung" + "\n");
//                                          ↑ 사용자가 입력한 값이 위에 조건와 맞을때 문자 출력
//                                           (조건이 맞아 실행되면 위 반복문에서 for(int i=0; i<1; i++)
//				                                                                    ↑ 이곳에 i++ 하시오 했으니 i=1로 변경되고 
//                                                                                    반복은 i<1 한번만 반복하라고 했으니 반복문에서 나간다 
			}else{
//             ↑ "그렇지 않으면" 이라는 입력문
				System.out.println("다시 시도해보세요");
//                                        ↑ 사용자가 입력한 값이 위에 조건과 맞지않을때 문자 출력
				--i;
//              ↑ 사용자가 입력한값이 4가 아니라면 그렇지않으면에 속하고 else에 있는 문자를 출력하고 i에 1을 더 한것에서 -1을 하라는 명령어
//                              (조건이 맞지않을경우 위에 for(int i=0; i<1; i++)	
//																  ↑ i가 다시 0 이므로 다시 반복문을 돈다.	
			}
			
		}
		System.out.println("\n\n\n\n\n\n\n\n\n\n");	

		System.out.println("2.다음 중, 형용사의 비교급이 아닌 것은?");
		
		System.out.println(" 1.taller\n 2.more beautiful\n 3.most interesting\n 4.fast");
	
				System.out.println("정답 : 3.most interesting\n");
			
				System.out.println("다시 시도해보세요");
			
			
				
		System.out.println("\n\n\n\n\n\n\n\n\n\n");		
		System.out.println("I'm sorry, I can't make it to the party tonight. 'make it to'의 의미는 무엇인가요?");
		System.out.println(" 1. ~을 만들다 2. ~에 도착하다 3. ~을 약속하다 4. ~을 이해하다");
		
		for(int i=0; i<1; i++) {
		
		int num = scan.nextInt();
			
			switch(num) {
//                  ↑ 사용자가 입력한 값을 num에 넣고 그 값을 입력	

//			     ↓ 정답에 해당되는 숫자입력
			case 2 : 
				System.out.println("정답 : 2. ~에 도착하다 \n");
				break;
//                 ↑  입력된값이 2번이라면 위에 문자를 출력한 후 break; 브레이크 문으로 조건문을 빠져나온다.			
			default :
//			   ↑ case2 외에 "모두 다" 라는 것을 default : 라 한다
				System.out.println("틀렸습니다\n");
				--i;
			}
		}	
		System.out.println("\n\n\n\n\n\n\n\n\n\n");			
		
		System.out.println("4 에서 3을 뺀 값은?");
		System.out.println(" 1. 2    2. 6    3. 1    4. -1");
		
		System.out.println("정답 : 1 \n");
		System.out.println("틀렸습니다\n");

		
		
		
		
		System.out.println("4.'The cat's out of the bag'는 어떤 의미인가요?");
		System.out.println(" 1. 비밀이 폭로되다 2. 적어도 한쪽은 이긴다 3. 아주 간단한 일이다 4. 그것이 아주 비싸다");
		
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
