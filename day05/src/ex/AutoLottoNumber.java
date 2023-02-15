package ex;

public class AutoLottoNumber {
	public static void main(String[] args) {
	
	
	
	
	int lotto[] = new int [6];		
	System.out.println("로또번호추첨");
	
    for (int i=0; i<lotto.length; i++) {
    	lotto[i] = (int)(Math.random()*45)+1;
    	for(int j=0; j<i; j++) {
    		if(lotto[i] == lotto[j]) {
    			i--;
    			break;
    		}
    	}
    	
    	
    }
    for (int i=0; i<lotto.length; i++) {
    	System.out.print(lotto[i]+", ");
   int result = lotto[i];
   System.out.print(result);
    }
		
   }
}