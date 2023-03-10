package test;

public class MinCommon {
	
	public void getMinCommon (int num1, int num2) {
		for(int i=num1; ; i+=num1) { // num1 이든 num2 이던 상관없다
			if(i%num1 == 0 && i%num2 == 0) { //num1은 빼도 된다 
			System.out.println("최소 공통되는 배수 : " + i);
			break;
			}
		}
	}
	
   /*
	int num1 = 10;
	int num2 = 15;
	int max = num1*num2;
	
	
	void getNum1MinCommon() {
		System.out.println(num1+"의 배수");
		for(int i=1; i<max; i++) {
			int Num1result = num1*i;
			System.out.print(Num1result+", ");
			if (Num1result == max) {
				break;
			}
		}
		System.out.println();
	}
	
	void getNum2MinCommon() {
		System.out.println(num2+"의 배수");
		for(int i=1; i<max; i++) {
			int Num2result = num2*i;
			System.out.print(Num2result+", ");
			if (Num2result == max) {
				break;
			}
		}
		System.out.println();
	}	 
	*/
				 
			
}	
		
		
	

