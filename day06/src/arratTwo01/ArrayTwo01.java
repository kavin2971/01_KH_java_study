package arratTwo01;

import java.util.Arrays;

public class ArrayTwo01 {

	public static void main(String[] args) {
		
		int[][]score1 = new int [5][4];
		int[][]score2 = {{34,78,98},
			           	{100,87,59,68}};
		
		System.out.println(score2[0][2]);
		System.out.println(score2[1][1]);
		
		score1[1][2] = 100;
		score1[0][1] = 50;
		
		System.out.println("score2 배열의 길이 : " + score2.length);
		System.out.println("score1 배열의 길이 : " + score1.length);
		
		System.out.println("score2 배열의 [0]행의 열의 길이 : " + score2[0].length);
		System.out.println("socre2 배열의 [1]행의 열의 길이 : " + score2[1].length);
		
		System.out.println("===========================================");
		
		
		
		int[][]score3 = {{34,78,98},
	           	        {100,87,59}};
		
		for(int i=0; i<score3.length; i++) {
			//행
			for (int j=0; j<score3[i].length; j++) {
				
				System.out.println(score3[i][j] + " ");
			}
		}
		System.out.println("===========================================");
		
		int[][]array =  new int [3][5];
		int num = 0;
		
//		array[0][0] = 1;
//		array[0][1] = 2;
		
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				array[i][j] = ++num;
				
				
	//			System.out.print(array[i][j]+" ");
			}
	//		System.out.println();
			System.out.println(Arrays.toString(array[i]));
		}

	}

}
