package objectMethod02;
class Op {
	// method (기능)
	void print1() {
		System.out.println("반환값이 없고 매개 변수가 없는 메서드");
	}
	
	int print2() {
		int result = 10;
		System.out.println("print2 반환값이 정수형이고 매개변수가 없는 메서드");
		return 50;
	}
	
    	String print3() {
		System.out.println("print3 반환값이 문자열이고 매개변수가 없는 메서드");
		return "kh정보교육원";
	}
    	boolean print4() {
    		System.out.println("print4 반환값이 boolean이고 매개변수가 없는 메서드");
    		return true;
    	}
    	void print5(int x) {
    		System.out.println(x);
    		int result = x + 10;
    		System.out.println("print5 "+result);
    	}
    	
    	String print6(String name) {
    		System.out.println("print6 반환값은 없고, 매개변수가 문자열 1개인 메서드");
    		return name + "님 반갑습니다.";
    	}
    	
    	int print7(int x, int y) {
    		int result = x + y;
    		return result;
    	}
}
public class MethodTest01 {

	public static void main(String[] args) {
		
		Op op1 = new Op();
		op1 .print1();
		
		int result = op1.print2();
		System.out.println(result);
		System.out.println("---------------------------------");
		
		System.out.println(op1.print2());
		System.out.println(op1.print3());
		
		
		op1.print5(50);
		System.out.println(op1.print6("김정민"));
		
		result = op1.print7(5, 10);
		System.out.println(result);
		System.out.println(op1.print7(5, 10));

	}

}
