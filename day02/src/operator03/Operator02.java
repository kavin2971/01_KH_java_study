package operator03;

public class Operator02 {

	public static void main(String[] args) {
		
	       int n1 = -20;
	       n1 = +n1;
	       
	       System.out.println(n1);
	       
	       n1 = -n1;
	       
	       System.out.println(n1);
	       
	       //
	       int x = 10;
	       int y = 7;
	       int result = x / y;
	    		   System.out.println(result); //int ÷ int = int, 몫만 나옴
	    		   
	    		   double result2 = x/y;
	    		   System.out.println(result2);
	    	// 실수형으로 결과를 보고싶으면 적어도 2수중에 1개이상은 실수형이어야 한다.	   
	    		   result2 = (double)x/y;
	    		   System.out.println(result2);
	    		   
	    	// % 나머지
	    		   result = x % y;
	    		   System.out.println(result);
	    	System.out.println("-----------------------------------");
	    	
	    		   x = 15;
	    		   y = 4;
	    		   result = x / y;
	    		   System.out.println(result);
	    		   result = x % y;
	    		   System.out.println(result);
	    		   System.out.println(x+"/"+y +" 의 몫은 "+ x/y + " 이고, 나머지 " + x%y + " 입니다.\n"); 
	    		   
	    		   int a = x/y;
	    		   int b = x%y;
	    		   System.out.println(x+"/"+y +" 의 몫은 "+ a + " 이고, 나머지 " + b + " 입니다.\n"); 

	}


}