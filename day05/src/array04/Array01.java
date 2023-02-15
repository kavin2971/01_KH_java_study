package array04;

public class Array01 {

	public static void main(String[] args) {
		int num1=0, num2=1, num3=2, num4=3, num5=4;
		//int 4byte, 첫번째 번지가 100 이라면, 다음번지는 104, 다음 108
		int [] arr1 = new int[5];
	    int arr2 [] = new int[10];
		// 배열표시 []는 자료형 또는 변수명 어디에 붙여도 상관없음
	    // 나중에 값을 넣고자할때는 new키워드로 생성하면서 반드시 갯수를 넣어줘야 한다

		double [] douarr = new double[10];
		
		int[] arr3 = {10,20,30,40,50,60,70,80,90,100};
		char[] chArr = {'a','b','c','d','e'};
		boolean bArr[] = {true, false, false, true, false};
		String strArr[] = {"이순신", "아무개", "홍길동"};
		
	//	System.out.println(arr3); //헤시코드
		
//		System.out.println(arr3[0]);
//		System.out.println(arr3[1]);
//		System.out.println(arr3[2]);
//		System.out.println(arr3[3]);
//		System.out.println(arr3[4]);
//		System.out.println(arr3[5]);
//		System.out.println(arr3[6]);
//		System.out.println(arr3[7]);
//		System.out.println(arr3[8]);
//		System.out.println(arr3[9]);
		
		System.out.println("==================");
		System.out.println(chArr[0]);
		System.out.println(bArr[0]);
		System.out.println(strArr[0]);
		
		for(int i=0; i<=9; i++) {
			System.out.print(arr3[i]+" ");
		}
		// 배열에 값 넣기
		arr1[0] = 15;
		arr1[2] = 20;
		arr1[4] = 35;
		
		System.out.println(arr1[0] + ", "+arr1[2]);
		System.out.println(arr1[1]);
		
//		for (int i=0; i<arr1.length; i++) {
//			System.out.print(arr1[i]+" ");
//	}
		System.out.println("======================");
			for (int i=0; i<5; i++) 
				System.out.print(arr1[i]+" ");
			
//			arr2[0] = 1;
//			arr2[1] = 2;
//			...
//			arr2[9] = 10;
			
			// 규칙이 있는 값을 배열에 넣기
			
			System.out.println("\n======================");
			for (int i=0; i<10; i++) 
				arr2[i]=i+1;
			
			for (int i=0; i<10; i++) 
			System.out.print(arr2[i]+" ");
			System.out.println("\n======================");
			
			//random으로 1~100까지 추출하여 100개의 배열에 넣기
			//생성한 배열에 random으로 1~100까지 추출하여 값넣기
			//출력하기
			
			int array[] = new int [10]; // 10개의 정수 배열생성
			for (int i=0; i<10; i++ ) { //for 조건식 10번반복
				int random = (int)(Math.random()*100+1);// 0.999999999를 99.9999999로 변경후 +1				
			array[i] = random; //array에 랜덤의숫자 를 입력
			
			System.out.print(array[i]+" "); // 띄어쓰기하지않고 넣어준 array 출력
		
			}
	}			
		
				


	}


