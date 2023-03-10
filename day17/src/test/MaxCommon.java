package test;

public class MaxCommon {
	public void getMaxCommon (int num1, int num2) {
		for(int i=num1; ; i--) {
			if(num1%i == 0 && num2%i == 0) {
				System.out.println("최대 공통되는 약수 : "+i);
			 break;	
			}
		}
	}

	    
	
	
}

