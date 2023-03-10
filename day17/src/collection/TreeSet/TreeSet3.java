package collection.TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSet3 {

	public static void main(String[] args) {
		
		Object[] arr = {1,4,6,7,3,2,8,9,3,4,5,6,7};
		
		TreeSet set = new TreeSet();
		for (Object i :arr)
			set.add(i);
		
		System.out.println(set);
		NavigableSet<Integer> desending = ((TreeSet<Integer>)set).descendingSet();
		for(Integer i : desending) {
			System.out.println(i+" ");
		}

	}

}
