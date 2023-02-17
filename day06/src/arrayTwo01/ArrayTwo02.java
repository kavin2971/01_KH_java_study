package arrayTwo01;

public class ArrayTwo02 {

	public static void main(String[] args) {
		int[][] score = {{90,89,100},
						 {89,97,48},
						 {68,93,88},
						 {79,38,92},
						 {100,59,81}};

				
		
		
		System.out.println("    국어   수학   영어   총점   평균");
		System.out.println("--------------------------------");
		
		// 사람별 총점
		int korSum = 0;
		int mathSum = 0;
		int engSum = 0;
		
		for(int i=0; i<score.length; i++) {  // 행
			int sum = 0;
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
			
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
				// System.out.print(score[i][j] + "  ");
				System.out.printf("%6d", score[i][j]);
			}
			System.out.printf("%6d", sum);
			// System.out.println((double)sum / 3);
			System.out.printf("%7.1f\n", (double)sum / 3);
		}
		System.out.println("================================");
		System.out.printf("%6d%6d%6d\n",korSum, mathSum, engSum);
		System.out.printf("%6.1f%6.1f%6.1f\n",(double)korSum/5, (double)mathSum/5, (double)engSum/5);
		
		/*
		for(int i=0; i<3; i++) {  // 열
			int sum = 0;
			for(int i=0; i<score.length; i++) {
				sum += score[j][i];
			}
			System.out.printf("%6d",sum);
		}
		*/
		
	}
}
