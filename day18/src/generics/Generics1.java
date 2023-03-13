package generics;

import java.util.ArrayList;
import java.util.List;

public class Generics1 {

	public static void main(String[] args) {
		
		/*
		 * generics
		 *  - compile-time에 타입 제한기능
		 *  - 요소 추가시에 타입 체크 기능
		 *  - 요소를 꺼낼때 해당 타입의 값을 보장
		 * 
		 * 사용하는 곳에 따라
		 *  - 클래스레벨 : 변수 타입이나 객체 생성시 작성하여 객체요소의 타입제한
		 *  - 메소드레벨 : 파라미터 / 리턴타입에 타입제한
		 * 
		 *	
		*///                    jbk1.7버전 이상부터는 우항의 제네릭은 생략가능!	
		// <> 안넣으면 모두 Object                    ↓
		ArrayList<String> list = new ArrayList<String>();

		// boxing(auto-boxing) : int -> Integer.valueOf(1) 
		// 객체형으로 자동으로 변형이 된다 
		// unboxing : 객체형테로 들어온 (Integer) => int
		
		list.add("안녕");
		//list.add(123);  위에 String으로 받겠다고 하여, 오류발생
		//list.add(Integer.valueOf(123));
		
		//String str = (String) list.get(0); //제네릭을 명시하지 않았을 경우 반드시 형변환 (Object->String)
		String str = list.get(0);
		//int num = (int)list.get(1); 오류발생, 위에 String으로 받겠다고 하여 오류발생
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);              //AutoBoxing
		list2.add(2);
		list2.add((int) 3.141);
		
		System.out.println(list2); //UnBoxing
		
		int num = list2.get(1);
		
//		double num = list2.get(1);
		
//		boolean num = list2.get(1); 오류발생
		
//		test1();
		test2();
	}
	public static void test1() {
		Parking<String> strPark = new Parking<>();
		strPark.add("AUDIA6 26너1826 흰색");
		strPark.add("BMW520d 13어0262 검정색");
		strPark.add("AUDIA7 15서2465 빨간색");
		strPark.add("BMW528i 19허1523 파란색");
		strPark.add("AUDIA8 22조6458 쥐색");
		strPark.add("BMW830i 11무1715 검정색");
		System.out.println(strPark.get(0));
		System.out.println(strPark.get(1));
		System.out.println("----------------");
		
		for (int i=0; i<strPark.size(); i++) {
			System.out.println(strPark.get(i));
		}
		
		System.out.println(strPark.indexOf("BMW520d 13어0262 검정색"));
		System.out.println(strPark.indexOf("AUDIA6 26너1826 흰색"));
		System.out.println(strPark.indexOf("BMW830i 11무1715 검정색"));
		System.out.println(strPark.indexOf("ZZZ"));
	}
	
	// 메소드 레벨 제네릭
	public static void test2() {
		int num1 = run(10);
		int num2 = run(20);
		String str = run("abc");
		
		System.out.println(num1+num2);
		System.out.println(str+num1+num2);
		System.out.println(num1+num2+str);
		System.out.println(str+(num1+num2));
		
		List<Integer> intList = of(1,3,5,9,7);
		System.out.println(intList);
		
		List<String> strList = of("5교시..", "졸려요..", "제네릭..", "어려워요..");
		System.out.println(strList);
		
		// 자바에서 Array를 List 변환해주는 메소드 Arrays.asList(array)사용
		// JDK 9 버전부터 List.of(array) 라는 새로운 팩토리 메소드 사용
		
		// Arrays.asList, List.of : 변경불가 list임. 삽입, 삭제 불가
		
		List <String> strList2 = List.of("자요?!", "졸면안되요!");
		System.out.println(strList2); 
//		strList2.add("말똥소똥");     // 변경불가 예시, 오류발생
		
	}
	public static <T> T run(T t){
		return t;
	}
	public static <E> List<E> of(E... elems){
		List<E> list = new	ArrayList<>();
		for (E e : elems) {
			list.add(e);
		}
		return list;
	}
	
}
