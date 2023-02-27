package interface02;

interface InterA{
	int MAX = 100;
	int MIN = 0;
}

public class InterfaceTest1 {
	public static void main (String[] args) {
		
		InterClass ic = new InterClass();
		
		// 인터페이스는 객체를 생성할 수 없다
		// 자료형변환은 가능
		Interface interf = ic;
		interf.method();
		interf.methodA();
		interf.methodB1();
		interf.methodA1();
		interf.methodB();
		System.out.println("------------------------");
		
		System.out.println(interf.MIN);
		System.out.println(interf.MAX);
		System.out.println("------------------------");
		
		InterfaceA interA = ic;
		interA.methodA();
		interA.methodA1();
		System.out.println("------------------------");
		
		InterfaceB interB = ic;
		interB.methodB();
		interB.methodB1();
	}
}
