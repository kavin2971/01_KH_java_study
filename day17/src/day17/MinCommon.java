package day17;

public class MinCommon {
	
    int i, j = 1;
	int num1 = 10;
	int num2 = 15;
	int minCommon1, minCommon2=0;

	
	void getMinCommon() {
		
		for(int i=1; i<=num1; i++) {	1 2 3 4 5 6 7 8 9 10
			minCommon1 = num1*i;  10 20 30 
		
			for (int j=1; j<=num2; j++){ 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
				minCommon2 = num2*j;  15 30 45
		
				 if(minCommon1 == minCommon2)  {
					System.out.println(((minCommon1+minCommon2)/2)+", ");
					
				 }else if(num1 == i && num2 == j) {
						break;
				 }
			}
		
		}
	}	
	
}
