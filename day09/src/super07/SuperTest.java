package super07;
class Parent{
	int x = 10;
	
}
class Child extends Parent{
	int x = 100;
	void method() {
		int x = 1000;
		System.out.println("x="+x); //부모도 인스턴스도 보지않고 지역변수만 호출
		System.out.println("this.x="+this.x);//지역변수는 보지않고 인스턴스변수 부터 확인하여 호출
		System.out.println("super.x="+super.x);// 내것은 보지않고 부모것만호출
	}
}
public class SuperTest {

	public static void main(String[] args) {
		
		Child ch = new Child();
		ch.method();

	}

}
