package abstract01;

public class Tiger extends Animal{
	
	Tiger() {
		kind = "포유류";
	}
	@Override
	void sound() {
		System.out.println("어흥");
	}

}
