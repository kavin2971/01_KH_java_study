package array04;

public class Array05 {

	public static void main(String[] args) {
		// 로또
//		int array[] = new int [6]; 
//		System.out.println("로또번호 ");
//		for (int i=0; i<array.length; i++ ) { 
//			int lotto = (int)(Math.random()*45+1);		
//		array[i] = lotto; 
//		
//		
//		System.out.print(array[i]+" "); 
//				
//
//	    }
		int lotto[] = new int [45];		// 45개의 배열
		System.out.println("로또번호추첨");
		
		for (int i=0; i<lotto.length; i++) // 조건식
		     lotto[i]=i+1;		
		for(int i=0; i<6; i++) {
		int number = (int)(Math.random()*45); // 랜덤으로 숫자추출
		int mix = lotto[i];
		lotto[i] = lotto[number];  //섞는다
		lotto[number] = mix;
		
		
		}
		for(int i=0; i<6; i++)
			System.out.print(lotto[i] + ", ");
		
    }
}