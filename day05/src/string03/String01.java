package string03;

public class String01 {

	public static void main(String[] args) {
		//ex 김정민 객체생성 주소 100, kh정보교육원 객체생성 주소 200 kh정보교육원 객체생성 주소 300
		
		String name = "김정민";
		String name2 = "김정민";
		
		System.out.println("주소가 같은가? "+(name==name2));
		
		String name3 = new String("kh정보교육원");
		String name4 = new String("kh정보교육원");
				
		System.out.println("주소가 같은가? "+(name3==name4));
		
		String name5 = "함미진";
		String name6 = "함미진";
		System.out.println("주소가 같은가? "+(name5==name5));
		
		name = "김춘식";
		
		System.out.println(name+" "+name2+"\n"+name3+" "+name4+"\n"+name5+" "+name6);
				
		System.out.println("주소가 같은가? "+(name==name2));
		
		name2 = "김춘길";
		name6 = "김춘실";
		
		System.out.println(name5+" "+name6);
				System.out.println("주소가 같은가? "+(name5==name6));
		//객체는 덮어쓰기가 안된다.
				System.out.println(name3+" "+name4);
		System.out.println("주소가 같은가? "+name3.equals(name4));
		System.out.println("주소가 같지 않은가? "+!(name3.equals(name4)));
		//length() 괄호가있으면 메서드, 없으면 변수 
		
		boolean bool = name.equals("김춘식");
	}

}
