package operator03;

public class Operator04 {

	public static void main(String[] args) {
		// 논리연산자
		// && : 조건이 모두 다 참일때만 참
		// || : 조건중 1개라고 참이 있으면 참
		
		int num1 = 10;
		int num2 = 10;
		System.out.println("1.===========");
		System.out.println(num1>20 && num2>5); // 둘다 참이어야 참
		System.out.println("2.===========");
		System.out.println(num1>20 || num2>5); // 1개만 참이어도 참
		System.out.println("3.===========");
		
	    int num3 = 10;
	    System.out.println(num1<20 && num2>5 && num3<15); //&& 모두 참일때만 참
	    System.out.println("4.===========");
	    System.out.println(num1<20 && num2>5 && num3>15);
	    System.out.println("5.===========");
	    
	    System.out.println(num1<20 || num2>5 || num3>15);
	    System.out.println("6.===========");
	    
	    // ! : not  반대 참이면 거짓으로 거짓이면 참으로
	    boolean bool = true;
	    bool = !bool;
	    System.out.println(bool);
	    
	    char ch = ']';
	    
	    System.out.println("7.===========");
	    bool = ch <'C';
	    System.out.println(bool);
	    System.out.println("8.===========");
	    System.out.println((ch>='A') && (ch<='Z'));
	    System.out.println((ch>='a') && (ch<='z'));
	    System.out.println((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'));
	}

}
