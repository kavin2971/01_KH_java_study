package polymorphism01;
class Animal {
	void breathe() {
		System.out.println("숨을 쉬고");
	}
	void run() {
		System.out.println("빠르게 달린다\n");
	}
	void eat() {
		System.out.println("밥을 먹다말고");
	}
	void sound() {
		System.out.println("짖는다");
	}
}
class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("월월~ 개가짖다가");
	}
}
class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("야옹~ 고양이가 울다가");
	}
    void jump() {
    	System.out.println("높이 점프를 뛰어오르고 ");
    }
}
class Lion extends Animal {
	@Override
	void sound() {
		System.out.println("어흥! 호랑이가 울다가");
	}
}

public class PolymorphismTest4 {
	public static void main(String[] args) {
		
		Animal a = new Dog();
		
		a.sound();
		a.eat();
		a.breathe();
		a.run();
		
		a = new Lion();
		a.sound();
		a.eat();
		a.breathe();
		a.run();
		
		a = new Cat();
		Cat b = (Cat)a;
		a.sound();
		a.eat();
		a.breathe();
		b.jump();
		a.run();
	
		Cat cat = new Cat();
		cat = (Cat)a;
		
		//Animal a2 = new Animal();
		//cat = (Cat)a2;
		
		Animal a3 = new Cat();
		if(a3 instanceof Cat) {
			Cat cat1 = (Cat)a3;
			System.out.println("자식클래스로 변화됨");
		}else {
			System.out.println("자식클래스로 강제 형변환 안됨");
		}
		Animal a4 = new Animal();
		if(a4 instanceof Cat) {
			System.out.println("자식클래스로 변화됨");
		}else {
			System.out.println("자식클래스로 강제 형변환 안됨");
		}

	}

}
