package phone05;

public class PhoneTest extends Object {

	public static void main(String[] args) {
		
		Phone sp = new SmartPhone();
		Phone cp = new CellPhone();
		
		System.out.println("스마트폰");
		sp.bell();
		sp.hangup();
		sp.hangout();
		
		System.out.println("------------------");
		
		System.out.println("효도폰");
		cp.bell();
		cp.hangup();
		cp.hangout();
		
		
		

	}

}
