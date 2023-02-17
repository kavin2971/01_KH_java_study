package array04;

public class Array01 {

	public static void main(String[] args) {
		int num1=0, num2=1, num3=2, num4=3, num5=4;
		
		// 배열표시 []는 자료형 또는 변수명 어디에 붙여도 상관없음
		// 나중에 값을 넣고자할때는 new키워드로 생성하면서 반드시 갯수를 넣어줘야 한다.
		int[] arr1 = new int[5];
		int arr2[] = new int[10];
		
		double[] douArr = new double[10];
		
		// int[] b = new int[5] {1,2,3}; // 오류 갯수가 양쪽있으면 안됨
		int[] a = new int[] {1,2,3};
		int[] arr3 = {10,20,30,40,50,60,70,80,90,100};
		char[] chArr = {'a','b','c','d','e'};
		boolean bArr[] = {true, false, false, true, false};
		String strArr[] = {"이순신","아무개","홍길동"};
		
		// 1개의 값 출력시 index번호를 이용하여 출력.
		// index번호는 반드시 0부터 시작
		System.out.println(arr3[2]);		
		System.out.println(chArr[3]);
		
		// 배열의 모든값 출력
		for(int i=0; i<=9; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		
		// 배열에 값 넣기
		arr1[0] = 15;
		arr1[2] = 25;
		arr1[4] = 35;
		
		System.out.println(arr1[0] + ", " + arr1[2]);
		System.out.println(arr1[1]);
		
		for(int i=0; i<5; i++)
			System.out.print(arr1[i] + " ");
		
		System.out.println();
		System.out.println("--------------------");
		
		// 규칙이 있는 값을 배열에 넣기
		for(int i=0; i<10; i++) {
			arr2[i] = i+1;
			System.out.print(arr2[i] + " ");
		}

		System.out.println();
		
		// 정수형 배열 10개 생성
		// 생성한 배열에 random으로 1~100까지 추출하여 값 넣기
		// 출력하기
		
		int[] iArr = new int[10];
		for(int i=0; i<10; i++) {
			iArr[i] = (int)(Math.random()*100)+1;
			System.out.print(iArr[i] + " ");
		}
	}
}
