package breakConti02;

public class break01 {

	public static void main(String[] args) {
		// 
		
		int sum=0, i=0;
		while(true) {
			
			if (sum >100)
				break;
			i++;
			sum+=i;
			
		}
		System.out.println("합계가 100 이 넘는순간은");
		System.out.println("1~ " + i + " 의 합계 " + sum);

	}

}
