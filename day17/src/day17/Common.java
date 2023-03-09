package day17;

public class Common {
	
  int num = 10;
	
	void getCommon () {
		
		for(int i=1; i<=num; i++) {
			if(num % i ==0) {
				System.out.print(i+", ");
				
			}else if(i == num ) {
				break;
				
			}
		}
	}
	
	    	
	
	
}
