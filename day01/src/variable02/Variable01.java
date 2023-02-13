package variable02;

public class Variable01 {

	public static void main(String[] args) {
		//int 정수
		int number; //4byte 구나~
		number = 25; //25를 2진수로 변경하여 number에 저장하시오~
		// ex) 0000 0000 0001 1111 = 25
		
		int number2 = 30;  //리터럴값이라고 한다
		
		System.out.println(number+number2);
		
		int result = number + number2; // 선언을 하고 값을 넣을때 리터럴값이다.
		System.out.println(result);
		System.out.println(result*3);
		System.out.println(result/5);
		System.out.println(result*number);
		System.out.println("-----------------");
		
		//int를 넣지않으면 위의 값으로 유지됨
		
		number = 100;
		number2 = 200;
		
		System.out.println(result);
		int result2 = number + number2;	
		System.out.println(result2);
		System.out.println(result+result2);
		

	}

}
