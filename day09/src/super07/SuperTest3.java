package super07;

class Parent2 {
	int x;
	Parent2(int x){
		this.x = x;
		System.out.println("부모 생성자");
	}
}

class Child2 extends Parent2{
	int x = 100;
	Child2() {
		super(110);
		System.out.println("자식 생성자");
	}
		void superX() {
			System.out.println(super.x);
		}
	
}

public class SuperTest3 {
	public static void main(String[] args) {
		Child2 ch2 = new Child2();
		ch2.superX();

	}

}
