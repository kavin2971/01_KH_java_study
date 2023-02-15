package arratTwo01;

import java.util.Scanner;

public class ArrayTwo03 {

	public static void main(String[] args) {
		
		int[][] score = new int [2][3]; //
		String[] name = {"김정민","함미진"};
		Scanner scan = new Scanner(System.in);
		
		
		
		for ( int i=0; i<score.length; i++) {
		      for (int j=0; j<score[i].length; j++) {
		    	System.out.println(name[i]+"의 점수 입력 : ");
		    	score[i][j] = scan.nextInt();
		    	
		      }
		      System.out.println();
		}
	      
		for ( int i=0; i<score.length; i++) {
		      int sum = 0;
		      for (int j=0; j<score[i].length; j++) {
		    	sum += score[i][j];		    	
		      }
	      
	//    	System.out.print("총점 : "+sum);
	//    	System.out.println("평균 : "+ (double)sum/3);
	    double avg = (double)sum/3;
	    if (avg >= 70)
	    	System.out.printf("%s의 평균 : %.1f점 입니다. 합격입니다\n",name[i],avg);
	    else
	    	System.out.printf("%s의 평균 : %.1f점 입니다. 불합격입니다\n",name[i],avg);
		}
		

	}
		
	
}
