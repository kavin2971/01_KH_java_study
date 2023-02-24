package operator04;

import java.util.Arrays;

public class OperatorTest {
	
	int b = 10; // 인스턴스 변수 (객체생성을 해야만 사용가능)
	static int c = 20; // 클래스 변수

	public static void main(String[] args) {
		
		
		
		Operator op1 = new Operator();
		System.out.println(op1.add(9.7));
		System.out.println(op1.add(5,4));
		System.out.println(op1.add(31.56,83.86));
		System.out.println(op1.add());
		System.out.println("---------------");
		
		int [] arr = {3, 8, 19, 38, 100, 293, 489};
		int arr2[] = new int [100];
		int value = 0;
		for (int i=0; i<arr2.length; i++) {
			value += 3;
		    arr2[i] = value;

		}
		System.out.println(Arrays.toString(arr2));
		System.out.println("100개의 배열에 3의배수를 넣고 그 합계를 구하면 : "+op1.add(arr2));
		System.out.println("---------------");

		Operator op2 = new Operator();
		
//		var a = op1.add(9.7);
//		var b = op1.add(5,4);
//		var c = op1.add(31.56,83.86);
//		var d = op1.add();
		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
		System.out.println("---------------");
		

		
		System.out.println(op2.subtract(24,6));
		System.out.println(op2.multiply(6,3));
		System.out.println(op2.divide(36,2));
		System.out.println("---------------");
		
//		var e = op2.subtract(24,6);
//		var f = op2.multiply(6,3);
//		var g = op2.divide(36,2);
//		
//		System.out.println(e);
//		System.out.println(f);
//		System.out.println(g);
		
		System.out.println("클래스 메서드 호출 값 : "+msg());
		System.out.println("---------------");
		System.out.println("클래스 변수 c의 값 : "+c);
		OperatorTest ot = new OperatorTest();
		System.out.println("인스턴스 변수 b의 값 : "+ot.b);
		System.out.println("인스턴스 메서드 호출 값 : "+ot.sum2());
		System.out.println("인스턴스 메서드 호출 값 : "+ot.sum2(op1.num1));
		System.out.println("---------------");
		
	}
	static String msg() {
		return "안녕";
	}
	int sum2() {
		return 100;
	}
	int sum2(int a) {
		return a+100;
	}

}
