package collection.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		
		
		System.out.println("\"로또 추첨\"");
		Set lotto = new TreeSet();
		for(int i=0; lotto.size()<6; i++) {
			lotto.add((int)(Math.random()*45+1));
		}
		System.out.println(lotto);


	}

}
