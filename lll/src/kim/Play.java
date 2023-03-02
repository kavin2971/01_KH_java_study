package kim;

public class Play extends P_Method{

	public static void main(String[] args) {
		// 자리바꿈
		
		
		int a = 10;
		int b = 45;
		int tmp = 0;
		int 추출갯수 =7;
		
		
		tmp = a;
		a = b;
		b = tmp;
		
		System.out.println("1~ 몇까지 숫자를 섞을까요?  1~" + a + "까지의 숫자");
		System.out.println("섞은 뒤에 몇개의 숫자를 뽑을까요? " + b + "개의 숫자추출");
		
		// 로또 1~45
		// 배열 45개에 1~45까지 값 넣기
		// for 
		// index번호 랜덤으로 추출하여 자리바꿈하기
		
		int[] lotto = new int[45];
		
		for(int i=0; i<lotto.length; i++) 
			lotto[i] = i+1;
	
		
		for(int i=0; i<6; i++) {
			int index = (int)(Math.random()*45+1);
			 tmp = lotto[i];
			lotto[i] = lotto[index];
			lotto[index] = tmp;
//		}
//		
//	
//			for (int i=0; i<추출갯수.length; i++) {
//				if(i < l추출갯수.length-1)
//					
			System.out.print(lotto[i] + ", ");	
			
			}System.out.println(" \n");

		
		
		System.out.println();
		System.out.println("---------------------");
		
	}
}

