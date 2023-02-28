package exception01;

public class _04_NumberFormatException {

	public static void main(String[] args) {
		String[] strNum = {"23", "a17", "3.141592"};
		int i=0;
		
	try {
			
		for (i=0; i<strNum.length; i++) {
			
		     int x = Integer.parseInt(strNum[i]);
		
		System.out.println(x);
			
		}
	}catch(NumberFormatException e) {
			System.out.println(strNum[i]+"은 정수로 변환할 수 없습니다.");
	}
	

	}

}
