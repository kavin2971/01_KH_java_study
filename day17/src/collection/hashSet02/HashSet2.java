package collection.hashSet02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet2 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("JAVA");
		set.add("HTML");
		set.add("JSP");
		set.add("JAVA");
		set.add("ORACLE");
		
		System.out.println("size : " + set.size()); // 동일한 JAVA, JAVA 1개로 인정
		
		set.remove("HTML");
		set.remove("ORACLE");
		iteratorPrint(set.iterator());
		
		
	}
	static void iteratorPrint(Iterator<String> i) {
		while(i.hasNext()) {
			System.out.print(i.next()+ " ");
		}
		System.out.println();
	}
}
