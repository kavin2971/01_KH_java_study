package polymorphism01;
//////////////////////////////////////////////////
class Parent {
	void method1 () {
		System.out.println("Parent-method1()");
	}
	void method2 () {
		System.out.println("Parent-method2()");
	}
	
}
///////////////////////////////////////////////////
class Child extends Parent {
	@Override //← 오버라이딩을 하겠다는 말
	void method2 () {
		System.out.println("Parent-method2() OverRiding");
	}
	void method3 () {
		System.out.println("Child-method1()");
	}
	void method4 () {
		System.out.println("Child - method2()");
	}
}
///////////////////////////////////////////////////
public class PolymorphismTest3 {
	public static void main(String[] args) {
		
//		Child c1 = new Child();
//		Parent p1 = c1;  동일
		Parent p1 = new Child();
		//부모타입으로 형변환을 했기 때문에 부모것만 쓸 수 있다
		p1.method1(); 
		// 오버라이딩을 한 경우 부모타입으로 형변환을 했어도 자식것이 호출됨
		p1.method2();
		// p1.method3(); 자식것은 호출 불가

	}

}
