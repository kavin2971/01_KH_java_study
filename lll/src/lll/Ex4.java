package lll;

public class Ex4 {

	public static void main(String[] args) {
		
		int ranking = 1;
		char medalColor;
		
		switch(ranking) {
			case 1 : medalColor = 'G';
					break;
			case 2 : medalColor = 'S';
					break;			
			case 3 : medalColor = 'B';
					break;
			
			default:
				
					 medalColor = 'A';
		}
		System.out.println(ranking + "등 메달의 색깔은 "+ medalColor+" 입니다");
			
		
		int sum = 0;
		int i = 0;
		for (i= 0; ; i++) {
			sum = i++;
			if (sum >= 500) 
				break;
		}
		System.out.println("i : " + i);
		System.out.println("sum : " + sum);
		
		int total =0;
		int j;
		for(j=1; j<=100; j++) {
			if (j % 2 == 0)
				continue;
			total += j;
		}
		System.out.println("1부터 100까지의 홀수의 합은 : "+total+"입니다");
		
		int total1 =0;
		int k;
		for(k=1; k<=100; k++) {
			
			if (k % 2 == 1)
				continue;
			total1 += k;
		}
		System.out.println("1부터 100까지의 짝수의 합은 : "+total1+"입니다");
	    }

    }

