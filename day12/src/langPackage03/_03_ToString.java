package langPackage03;

public class _03_ToString {

	public static void main(String[] args) {
		
		Value v1 = new Value(5);
		Value v2 = new Value(5);
		
		System.out.println(v1);
		System.out.println(v1.toString()); // toString을 안써도 출력값은 동일하다
		
		Card card1 = new Card();
		Card card2 = new Card("HEART", 10);
		Card card3 = new Card("CLOVER", 7);
		
		System.out.println(card1);
		System.out.println(card2);
		System.out.println(card3);
		


	}

}
