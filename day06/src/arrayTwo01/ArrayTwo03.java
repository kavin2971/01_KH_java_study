package arrayTwo01;

import java.util.Scanner;

public class ArrayTwo03 {

	public static void main(String[] args) {
		// 2행 3열 배열 생성
		// 사용자로부터 점수를 입력 받아 넣기
		// 사람별로 평균 70점 이상이면 합격 그렇지 않으면 불합격
		
		// 평균 ??.?입니다. 합격입니다
		// 평균 ??.?입니다. 불합격입니다
		int[][] score = new int[2][3];
		String[] name = {"홍길동","아무개"};
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<score.length; i++) {
			int sum = 0;
			for(int j=0; j<score[i].length; j++) {
				System.out.print(name[i] + "의 점수 입력 : ");
				score[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		for(int i=0; i<score.length; i++) {
			int sum = 0;
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
			}
			double avg = (double)sum/3;
			if(avg >= 70)
				System.out.printf("%s의 평균 : %.1f점 입니다. 합격입니다\n", name[i],avg);
			else 
				System.out.printf("%s의 평균 : %.1f점 입니다. 불합격입니다\n",name[i],avg);
		}
		/*
		for(int i=0; i<score.length; i++) {
			int sum = 0;
			for(int j=0; j<score[i].length; j++) {
				System.out.println("점수 입력 : ");
				score[i][j] = sc.nextInt();
				sum += score[i][j];
			}
			double avg = (double)sum/3;
			if(avg >= 70)
				// System.out.println("평균 : " + avg + "점 입니다. 합격입니다");
				System.out.printf("평균 : %.1f점 입니다. 합격입니다\n", avg);
			else 
				// System.out.println("평균 : " + avg + "점 입니다. 불합격입니다");
				System.out.printf("평균 : %.1f점 입니다. 불합격입니다\n", avg);
		}
		*/
	}
}
