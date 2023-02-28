package exception01;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class _06_InputMismatchException {

	public static void main(String[] args) {
		           //              ↑ run -> run configulation -> Agument  입력시 출력가능
		System.out.println(Arrays.toString(args));
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 3개 입력 ");
		
		int sum = 0;
		
		for(int i=1; i<=3; i++) {
			System.out.println(i+"번째 정수 입력 : ");
			
			try {
			int num = scan.nextInt();
			sum += num;
			}catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다");
				
//				e.printStackTrace();
//				System.out.println("예외메세지 : " + e.getMessage());
				
				scan.next(); 
				// 입력하지 않으면 Exception 사라지지않고 무한반복 "다음으로 넘어가시오"라는 명령어
				--i;
				// i를 1개 감소시켜 정수입력 질문으로 다시돌아가 재입력 요청함
			} 
		}
		System.out.println("입력한 정수 값의 합 = " + sum);

	}

}
