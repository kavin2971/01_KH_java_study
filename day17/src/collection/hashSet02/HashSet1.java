package collection.hashSet02;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
class A {
	String aa;
	public A (String aa) {
		this.aa =aa;
	}
}
public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet set1 = new HashSet();
		Set set2 = new HashSet();
		
		A a1 = new A("f");
		
		set1.add(new A ("d"));
		set1.add(new A ("b"));
		set1.add(a1);
		set1.add(new A ("e"));
		set1.add(new A ("a"));
		
		System.out.println("size : " + set1.size());
		
		Iterator<A> iterator = set1.iterator();
		
		while(iterator.hasNext()) {
			A a2 = iterator.next();
			System.out.println(a2.aa+" ");
		}
		System.out.println();
		
		set1.remove(a1);
		System.out.println("set 1 삭제후 출력 : ");
		iteratorPrint(set1.iterator());
		System.out.println();
		
		set1.add(new A ("c"));
		System.out.println("size : "+ set1.size());
		System.out.print("set1에 e 입력후 출력 : ");
		iteratorPrint(set1.iterator());
		System.out.println();
		
		set1.add(a1);
		System.out.println("size : " + set1.size());
		set1.add(a1);
		System.out.println("size : " + set1.size());
		System.out.print("set1에 a1을 2번 입력후 출력 : ");
		iteratorPrint(set1.iterator());
		System.out.println();
	}

	static void iteratorPrint(Iterator<A> i) {
		while(i.hasNext()) {
			A a2 = i.next();
			System.out.print(a2.aa+ " ");
		}
		System.out.println();
	}
}
