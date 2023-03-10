package collection.hashSet02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Member {
	public String name;
	private int age;
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {  // 값 비교
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return member.name.equals(name) && member.age==age;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode()+age;
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
}

public class HashSet4 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("강감찬", 20));
		set.add(new Member("강감찬", 20));
		
		System.out.println("size : " + set.size());
		iteratorPrint(set.iterator());
		System.out.println();
	}
	static void iteratorPrint(Iterator<Member> i) {
		while(i.hasNext()) {
			
			System.out.print(i.next() + " "); // 패키지명,클래스명 @주소(toString 오버라이딩 하지 않았을때)

		}
		System.out.println();
	}

}
