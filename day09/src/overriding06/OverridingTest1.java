package overriding06;

class Ea {
	void print () {
		System.out.println("부모 클래스의 print() 메서드");
	}
}

class Eb extends Ea {
	void print () {
		System.out.println("자식 클래스의 ptint() 메서드");
		System.out.println("-----------------------");
	}
}

public class OverridingTest1 {
	public static void main(String[] args) {
		
		Eb eb = new Eb();
		eb.print();
		
		Ob ob = new Ob();
		ob.show();
		ob.show("인자1개");

	} 

}
class Oa {
	void show () {
		System.out.println("자식의 show() 메서드");
	}
}
class Ob extends Oa {
	void show (String name) {
		System.out.println("부모의 show() 메서드");
	}
}
