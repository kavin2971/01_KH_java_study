package operator03;

public class Operator03 {

	public static void main(String[] args) {
		// 비교 연산자
		// >, <, >=, <=, ==, !=
		//크다,작다,크같,작같,같다,같지않다
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println (num1 > num2);
		
		boolean bool = num1 > num2;
		System.out.println(bool);
		
		bool = num1 == num2;
		System.out.println("num1과 num2는 같은가? "+bool);
		
		bool = num1 != num2;
		System.out.println("num1과 num2가 같지않은가? "+bool);
		
		// && 모두 참일 경우 true  AND 그리고
		// || 하나 라도 참일 경우 true OR 
		

	}

}
