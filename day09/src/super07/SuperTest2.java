package super07;

class Parent1 {
	
	int x = 10;
	
	void show() {
		System.out.println("부모클래스 show() 메서드");
	}
}

class Child1 extends Parent1{
	int x = 100;
	void show() {
		System.out.println("자식클래스 show() 메서드");
	}
	void write() {
		int x = 500;
		show();
		super.show();
		System.out.println("지역변수 x변수 : " + x);
		System.out.println("Child1의 x변수 : " + this.x);
		System.out.println("Parent1의 x변수 : " + super.x);
	}
}
public class SuperTest2 {

	public static void main(String[] args) {
		Child1 ch1 = new Child1();
		ch1.write();

	}

}
