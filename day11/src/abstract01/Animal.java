package abstract01;

public abstract class Animal {
//abstract public class Animal { 위와 동일
	String kind;
	
	void breathe() {
		System.out.println("숨을 쉽니다");
	}
	
	abstract void sound();

}
