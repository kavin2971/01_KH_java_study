package object01;

public class ObjectTest01 {

	public static void main(String[] args) {
		
		Object01 ob1 = new Object01();
		// 클
		System.out.println(ob1.name);
		//                 변수이름. 속성명
		System.out.println(ob1.tel);
		ob1.tel = "02-3456-9098";
		
		System.out.println(ob1.tel);
		System.out.println(ob1.add);
		ob1.add = "서울특별시 영등포구 여의도동 삼성빌딩 12층";
		
		System.out.println(ob1.add);
		System.out.println(ob1.num);
		ob1.num = 100;
		System.out.println(ob1.num);
		System.out.println("-------------------------");
		System.out.println("ob1 객체의 주소 : " + ob1.add);
		System.out.println("ob1 객체의 번호 : " + ob1.tel); 
		System.out.println("ob1 객체의 이름 : " + ob1.name); 
		System.out.println("ob1 객체의 숫자 : " + ob1.num); 
		
		Object01 ob2 = new Object01();
		System.out.println("-------------------------");
		System.out.println("ob1 객체의 주소 : " + ob2.add);
		System.out.println("ob1 객체의 번호 : " + ob2.tel); 
		System.out.println("ob1 객체의 이름 : " + ob2.name); 
		System.out.println("ob1 객체의 숫자 : " + ob2.num); 
		
//		Scanner scan = new Scanner(); 
//      Object01 ob1 = new Object01();
	
		Car car = new Car();
		System.out.println("---------------------------");
		System.out.println("car 객체의 회사명 : "+ car.company);
		System.out.println("car 객체의 모델명 : "+ car.model);
		System.out.println("car 객체의 색상 : "+ car.color);
		System.out.println("car 객체의 기어 : "+ car.gear);
		System.out.println("car 객체의 최대속도 : "+ car.maxspeed);
		System.out.println("---------------------------");
		car.color = "black";
		System.out.println("car 객체의 변경색상 : "+ car.color);
		

	}

}
