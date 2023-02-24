package super07;

class Parent3 {
	int parenNum;
	Parent3(int y){
		this.parenNum = y*y;
		System.out.println("ParenNum의 매개변수값 y제곱 : " + parenNum);
	}
}
class Child3 extends Parent3{
	int childNum;
	Child3(int x, int y) {
		super(y);
		this.childNum = x*x;
		System.out.println("childNum의 매개변수값 x제곱 : " + childNum);
	}
}
public class SuperTest4 {
	public static void main(String[] args) {
		Child3 ch3 = new Child3(3,7);
	}
}
