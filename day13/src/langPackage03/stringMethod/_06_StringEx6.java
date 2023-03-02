package langPackage03.stringMethod;

public class _06_StringEx6 {

	public static void main(String[] args) {
		// substring(시작index, 끝index) : 시작index ~ 끝index 직전까지
		// substring(시작 index) : 시작index ~ 끝까지
		
		String str = "공공데이터 융합 웹 애플리케이션 개발자 양성과정2";
	//	String subStr = str.substring(6, 8);
		System.out.println(str.substring(6, 8));
		
		System.out.println(str.substring(9));
		System.out.println(str.substring(2));
		
		String sn = "041121-3789760";
		String year = "23";
		String age = sn.substring(0,2); 
		
		int age1 = Integer.parseInt(age);
		int year1 = Integer.parseInt(year);
		int nai = year1-age1;
		
		
		System.out.println("나이는? "+(Integer.parseInt(year)-Integer.parseInt(age)));
		System.out.println("올해 나이는? "+(nai)+"세");
		System.out.println("생일은? "+sn.substring(2,4)+"월 "+ sn.substring(4,6)+"일");
		
		if(sn.substring(7,8).equals("1") || sn.substring(7,8).equals("3")) {
			System.out.println("성별은 남자");
		}else  {
			System.out.println("성별은 여자");
		}
		
//		char character = sn.charAt(7);
//		
//		switch (character) {
//		case '1' : case '3' :
//		System.out.println("남자");
//		break;
//		case '2' : case '4' :
//		System.out.println("여자");
//		break;
//		default :
//			System.out.println("잘못입력");
//		}
		
		

	}

}
