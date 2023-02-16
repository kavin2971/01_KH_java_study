package ex;

public class Ex0005 {

	public static void main(String[] args) {

				 int [][]score = {{95, 80, 47},
							      {75, 29, 30},
							      {62, 76, 90},
								  {83, 84, 79}};
				int korSum = 0;
				int engSum = 0;
				int matSum = 0;
				
				 
				 System.out.println("    국어   영어   수학   총점   평균 ");
				 System.out.println("    ---------------------------");
				 
				 
				 
				 for (int i=0; i<score.length; i++) {
					 int sum=0;
					
					 korSum +=score[i][0];
					 engSum +=score[i][1];
					 matSum +=score[i][2];
					 
				 
					 					 
					 for (int j=0; j<score[i].length; j++)	{	
					 
					 sum += score[i][j];
					 
				 System.out.printf("%6d", score[i][j]);
				 
				 }
					 System.out.printf("%6d", sum);
					 System.out.printf("%7.1f\n",(double)sum/3);
 
				 }

	}

}
