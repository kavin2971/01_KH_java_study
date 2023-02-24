package lll;



public class CardTest {

	public static void main(String[] args) {
		
		CardMember cm = new CardMember();
		
		cm.cardNumber();
		
		int[] a = new int[4];
		int[] b = new int[4];
		int[] c = new int[4];
		int[] d = new int[4];
		
		for(int i=0; i<a.length; i++) {
			a[i] = cm.cardNumber();
			for( int j=0; j<b.length; j++) {
				b[i] = cm.cardNumber();
				for (int k=0; k<c.length; k++) {
					c[i] = cm.cardNumber();
					for (int l=0; l<d.length; l++) {
						d[i] = cm.cardNumber();
					}
				}
			}
			
			System.out.printf("%d%d%d%d-\n",a[i],b[i],c[i],d[i]);
			
		}
		System.out.println("----------------");
		int[] card = new int[100];
		
	int[] num = {1,2,3,4};
	int[] num1 = {5,6,7,8};
	int[] num2 = {9,100};
	String [] z = {"-"};
	for(int i=0; i<card.length; i++) {	
		System.out.println(num[0]+""+num[1]+""+num[2]+""+num[3]+"-"+num1[0]+""+num1[1]+""+num1[2]+""+num1[3]+"-"+num2[0]);
		++num2[1];
		
			
		}
	}

}
