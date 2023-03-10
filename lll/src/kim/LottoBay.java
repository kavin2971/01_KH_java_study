package kim;

import java.util.Set;
import java.util.TreeSet;

public class LottoBay {

	void getLottoBay() {
		Set lotto1 = new TreeSet();
		for(int i=0; lotto1.size()<6; i++) {
			int random = (int)(Math.random()*45+1);
			lotto1.add(random);
		}
		System.out.println(lotto1);
		 
	}
}
