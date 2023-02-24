package inheritance;

class A1 {
    int i;
}

class B1 extends A1 {
	String i;
}

public class InheritanceTest03 {
//상속관계
	public static void main(String[] args) {

		B1 b1 = new B1();
		b1.i = "KH정보교육원";
	    System.out.println(b1.i);
//	    b1.i = 100; 불가.
	    
	    A1 a1 = new A1();
	    a1.i = 100;
	    System.out.println(a1.i);

	    
	    
		
		
	}

}
