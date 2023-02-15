package string03;

public class String02 {

	public static void main(String[] args) {//↓Class
		// String (참조자료형)을 기본자료형으로 변환 (Byte, Short, Integer)으로 변환
		String str = "30";
		int num = Integer.parseInt(str);
		System.out.println(num + 10);
		System.out.println(str + 10); // string 의 + 는 연결해서.. 연산불가
		
		byte b1 = Byte.parseByte(str);
		
		String str2 = "15.678";
		double d1 = Double.parseDouble(str2);
		
		String str3 = "true";
		boolean bool = Boolean.parseBoolean(str3);
		
		int num2 = 50;
		String str4 = String.valueOf(num2);
		System.out.println("str4+100");
		
		
		
		
	

	}

}
