package ex;

public class Ex0002 {

	public static void main(String[] args) {
//사람별 총점, 과목명 총점, 

		int[][] score = {{90, 90, 94},     
					     {87, 94, 96},     
					     {94, 92, 89},     
					     {92, 92, 97},     
					     {89, 88, 98}};;   
			     
			     
  System.out.println("    국어   영어   수학   총점   평균 ");
  System.out.println("    ---------------------------");


//총점
  
		    int korSum=0;
		    int mathSum =0;
		    int engSum = 0;
			  
			for (int i=0; i<score.length; i++) {
				int sum=0;
			/*
				score[0][1]
				score[1][1]
				score[2][1]
				score[3][1]
				score[4][1]
		    */								
				        korSum += score[i][0];
						mathSum += score[i][1];
						engSum += score[i][2];
						
				for (int j=0; j<score[i].length; j++) {
					sum += score[i][j];
					
					System.out.printf("%6d", score[i][j]);
					
				}
				System.out.printf("%6d", sum);
				System.out.printf("%7.1f\n",(double)sum/3);	
				
			}
			System.out.println("    ---------------------------");
			System.out.printf("%6d%6d%6d\n", korSum,mathSum, engSum);
			System.out.printf("%6.1f%6.1f%6.1f\n", (double)korSum, (double)mathSum, (double)engSum);
//	
//for (int i=0; i<3; i++) {
//	int sum=0;
//	for (int j=0; j<score.length; j++) {
//		sum += score[j][i];
//	
//	    }
//	System.out.printf("%6d", sum);{
	



	}
}
