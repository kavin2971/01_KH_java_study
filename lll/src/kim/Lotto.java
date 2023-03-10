package kim;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
	
		System.out.println("\"로또 추첨\"");
		Set lotto = new HashSet();
		for(int i=0; lotto.size()<6; i++) {
			lotto.add((int)(Math.random()*45+1));
		}
		System.out.println(lotto);

		//	Arrays.sort(lotto); 배열일경우 오름차순으로 정렬하는 메소드
	/*	
		HashSet<Integer> lotto2 = new HashSet<Integer>();
		while(lotto2.size()<6) {
			lotto2.add((int)(Math.random()*45+1));
		}
		List list = new LinkedList(lotto2);
		Collections.sort(list);
		System.out.println(list);
		*/
		
		System.out.println("\n\"로또 판매점\"");
		Set lotto1 = new TreeSet();
		for(int i=0; lotto1.size()<6; i++) {
			int random = (int)(Math.random()*45+1);
			lotto1.add(random);
		}
		System.out.println(lotto1);
	
	}
	
}
