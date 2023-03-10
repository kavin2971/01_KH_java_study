package test;

public class Common {
	

public void getCommon (int num) {
		System.out.println(num+"의 약수");
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				if(num ==i)
					System.out.println(i);
				else System.out.print(i+", ");
				
			}
		}
	}
	
	    	
	
	
}
