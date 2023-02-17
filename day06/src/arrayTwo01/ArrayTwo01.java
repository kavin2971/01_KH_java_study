package arrayTwo01;

public class ArrayTwo01 {

	public static void main(String[] args) {
		int[][] score1 = new int[5][3];
		int[][] score2 = {{34,78,98}, 
						  {100,87,59,68}};
		
		System.out.println(score2[0][2]);
		System.out.println(score2[1][1]);
		
		score1[1][2] = 100;
		score1[0][1] = 50;
		
		System.out.println("score2 배열의 길이(행) : " + score2.length);
		System.out.println("score1 배열의 길이(행) : " + score1.length);
		
		System.out.println("score2 배열 [0]행의 열의 길이 : " + score2[0].length);
		System.out.println("score2 배열 [1]행의 열의 길이 : " + score2[1].length);
		System.out.println("----------------------------------");
		
		int[][] score3 = {{34,78,98}, 
				  		  {100,87,59,98},
						  {34,98}};
		
		for(int i=0; i<score3.length; i++) {
			for(int j=0; j<score3[i].length; j++) {
				System.out.print(score3[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 2차원 배열 3행 5열 생성
		// 값 1~15 넣기
		// 출력하기
		System.out.println("----------------------------------");
		int[][] num = new int[3][5];
		int count = 0;
			
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				num[i][j] = ++count;
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	}
}
