package variable02;

public class Variable03 {

	public static void main(String[] args) {

		byte by1 = 10;
		System.out.println(by1);
		
		by1= 127;
		
		Short sh = 30000;
		System.out.println(sh);
		
		char ch1 = '김';
		int chInt = ch1; //형변환
		System.out.println("'김'의 유니코드 : " + chInt);
		
		//////////////////////////////////////
		double dou1 = 5/3.0; // double 소수점 하나는 꼭 실수여야한다
		System.out.println(dou1);
		
		
	}

}
