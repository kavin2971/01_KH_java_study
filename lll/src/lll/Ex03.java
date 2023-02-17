package lll;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
//		회원 100명의 명단을 만들고
//		카드를 발급받아서 넣어주고
		
//		회원의 영문이름 라스트네임 출력
//		회원의 전화번호 출력
//		카드번호는 123-123-***-*** 출력
		
		Scanner scan = new Scanner(System.in);
		String[] human = new String [10];
		
		for (int i=0; i<human.length; i++) {
			System.out.println(i+1+"번 카드번호 입력예시 123-123-123-123) 입력 : ");
			String cardNum = scan.next();
		       
		     if (cardNum.length() == 15 ) {
		   	char firstNum = cardNum.charAt(0);
		   	
		       	if  ( firstNum == '1') {
				human[i] = cardNum.substring(0,7) + "-***-***"; 
		   	}else { System.out.println("잘못입력");
		    --i;
		   	}
		   	}else {
		      System.out.println("잘못입력");
		      --i;
		   	}
		     }
		   System.out.println("입력완료");
		   System.out.println(Arrays.toString(human));
	
	    }

    }


