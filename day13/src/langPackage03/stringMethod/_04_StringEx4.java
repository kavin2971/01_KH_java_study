package langPackage03.stringMethod;

public class _04_StringEx4 {

	public static void main(String[] args) {
		String ssn = "2938505968487";
		int length = ssn.length();
		
		if(ssn.length() == 13) {
			System.out.println("자릿수가 맞습니다");
		}else{
			System.out.println("자릿수가 맞지않습니다");
		}
	}

}


