package student07;



public class StudentTest {

	public static void main(String[] args) {
		
		Student1 stu = new Student1(20201111,"김길동","010-1111-1111");
		System.out.println("학번 : "+stu.sNum);
		System.out.println("이름 : "+stu.name);
		System.out.println("전화번호 : "+stu.tel);
		System.out.println("-------------------");
		
		Student1 stu1 = new Student1(20201112,"이길동","010-2222-2222");
		System.out.println("학번 : "+stu1.sNum);
		System.out.println("이름 : "+stu1.name);
		System.out.println("전화번호 : "+stu1.tel);
		System.out.println("-------------------");
		
		Student1 stu2 = new Student1(20201113,"최길동","010-3333-3333");
		System.out.println("학번 : "+stu2.sNum);
		System.out.println("이름 : "+stu2.name);
		System.out.println("전화번호 : "+stu2.tel);
		System.out.println("-------------------");
		
		System.out.println("학번 "+stu.sNum +", 이름 "+stu.name+", 연락처 "+stu.tel);
		System.out.println("학번 "+stu1.sNum +", 이름 "+stu1.name+", 연락처 "+stu1.tel);
		System.out.println("학번 "+stu2.sNum +", 이름 "+stu2.name+", 연락처 "+stu2.tel);
		
		Car car1 = new Car(3);
		Car car2 = new Car("yellow");
		Car car3 = new Car("gray","K9");

	}

}
