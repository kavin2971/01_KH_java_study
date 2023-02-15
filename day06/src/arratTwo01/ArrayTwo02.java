package arratTwo01;

public class ArrayTwo02 {

	public static void main(String[] args) {
		
		//             score[0][0]   score[0][2]
		//                ↓         ↙
		int[][] score = {{90, 90, 94},     
					     {87, 94, 96},     
					     {94, 92, 89},     
					     {92, 92, 97},     
					     {89, 88, 98}};;   
        //			          ↑     ↖
		//               score[4][1]  score[4][2]   		
					     
		   System.out.println("    국어   영어   수학   총점   평균 ");
		   System.out.println("    ---------------------------");
		

		//총점
		for (int i=0; i<score.length; i++) {
			int sum=0;
		
			
			for (int j=0; j<score[i].length; j++) {
				sum = sum + score[i][j];
				
				System.out.printf("%6d", score[i][j]);
				
			}
			
			System.out.printf("%6d", sum);
			System.out.printf("%7.1f\n",(double)sum/3);	
			
		}
		System.out.println("    ---------------------------");
		
//			
//		for (int i=0; i<3; i++) {
//			int sum=0;
//			for (int j=0; j<score.length; j++) {
//				sum += score[j][i];
//			
//			    }
//			System.out.printf("%6d", sum);{
//			
//			
//			
//		    }
		
				
	}
	

}
