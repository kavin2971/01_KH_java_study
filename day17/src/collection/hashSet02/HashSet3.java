package collection.hashSet02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Person {
private String name;
private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
public class HashSet3 {
	public static void main(String[] args) {
		Set<Person> set = new HashSet<Person>();
		
		set.add(new Person("홍길동", 20));
		set.add(new Person("김춘길", 30));
		
		System.out.println("size : " + set.size());
		iteratorPrint(set.iterator());
		System.out.println();
	}
	static void iteratorPrint(Iterator<Person> i) {
		while(i.hasNext()) {
			
			/*
			Person p = i.next();
			
		    System.out.print(p.name()+", "); // 인스턴스 변수에 접근가능할때 사용할수있다
		    System.out.print(p.age()+"\t");
		    
		    System.out.print(p.getName()+", "); // 인스턴스 변수가 private 일때는 접속할수 없으므로 getter 매소드를 이용한다
		    System.out.print(p.getAge()+"\t");
		    */
			
			System.out.println(i.next() + " "); // 패키지명,클래스명 @주소(toString 오버라이딩 하지 않았을때)
		                                       // toString 오버라이딩을 했을 때 오버라이딩의 리턴값

		}
		System.out.println();
	}

}
