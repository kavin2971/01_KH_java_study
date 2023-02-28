package langPackage03;

import java.util.Arrays;

public class _04_Clone {

	public static void main(String[] args) {
		Card card1 = new Card("SPADE", 3);
		Card card2 = card1;
		
		System.out.println(card1);
		System.out.println(card2);
		
		int[] arr = {1, 2, 3, 4, 5};
		
		int[] arrClone = arr.clone();
		arrClone[0] = 6;
		arrClone[1] = 5;
		arrClone[2] = 8;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
		
		Card card3 = new Card("diamond", 8);
		Class cObj = new Card().getClass();
		System.out.println(cObj);
		System.out.println(cObj.getName());
		System.out.println(cObj.toString());
		
		

	}

}
