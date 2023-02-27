package interface03;

public class PhoneTest {

	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone();
		sp.turnOn();
		sp.setVolume(80);
		sp.search("인터페이스");
		sp.turnOff();
		System.out.println("-------------------------------");
		
		Phone phone = sp;
		phone.turnOn();
		phone.setVolume(-5);
		phone.turnOff();
		System.out.println("-------------------------------");
		
		Searchable sa = sp;
		sa.search("google");
		
		

	}

}
