package abstract01;

public class AnimalTest  {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Frog frog = new Frog();
		Tiger tiger = new Tiger();
		
		dog.sound();
		cat.sound();
		frog.sound();
		tiger.sound();
		
		System.out.println("----------------------");
		Animal ani = dog;
		ani.sound();
		
		ani = cat;
		ani.sound();

		ani = frog;
		ani.sound();
		
		ani = tiger;
		ani.sound();
		
		System.out.println("----------------------");
		
		aniSound(new Dog());
		aniSound(new Cat());
		aniSound(new Frog());
		aniSound(new Tiger());

	}
	
	static void aniSound(Animal ani) {
		ani.sound();
		ani.sound();
	}

}
