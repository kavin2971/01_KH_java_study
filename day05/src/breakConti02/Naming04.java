package breakConti02;

public class Naming04 {

	public static void main(String[] args)    {
		
		
		stop1: for (int i=1; i<=3; i++)    {
			   for (int j=1; j<=3; j++) {
		     	if(i==2)
				    break stop1;
		     	
		     	//continue stop1;
				System.out.println("i="+i+",j="+j);
			}
			    System.out.println("안에 for문 종료");
		 }
	        	System.out.println("밖에 for문 종료");
		

	}

}
