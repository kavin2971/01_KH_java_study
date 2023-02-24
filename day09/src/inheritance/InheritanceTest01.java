package inheritance;
class A {
	int aa = 1;
}

class B extends A {
	int bb = 10;
}

class C extends B {
	int cc = 30;
}

public class InheritanceTest01 {
//상속관계
	public static void main(String[] args) {
		C objC = new C();
		System.out.println("aa = "+objC.aa);
		System.out.println("bb = "+objC.bb);
		System.out.println("cc = "+objC.cc);
		
		B objB = new B();
		System.out.println("aa = "+objB.aa);
		System.out.println("bb = "+objB.bb);
//		System.out.println("cc = "+objB.cc); 사용불가
		
		A objA = new A();
		System.out.println("aa = "+objA.aa);
//		System.out.println("bb = "+objA.bb); 사용불가
//		System.out.println("cc = "+objA.cc); 사용불가


	}

}
