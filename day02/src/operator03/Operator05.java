package operator03;

public class Operator05 {

	public static void main(String[] args) {
		// 복합 대입 연산자
		int num1 = 10;
		
	//  num1 = num1 + 10; // 같은말이다 num1 = num1 + 10;
		num1 +=10;
		System.out.println(num1); //num1 = num1 + 10;
		num1 *=3;
		System.out.println(num1); //num1 = num1 * 3;
		num1 -=5;
		System.out.println(num1); //num1 = num1 - 5;
		num1 /=3;
		System.out.println(num1); //num1 = num1 / 3;
		num1 %=5;
		System.out.println(num1); //num1 = num1 % 5;
		// 주석을 잘달고, 짧게 작성 프로그램 잘하는사람
		System.out.println(num1);

	}

}
