package object01;

class Kh {
	String add = "서울";
			int num = 10;
}

class Student {
    String name = "김춘식";
    boolean gender = true;
	
}
public class ObjectTest02 {
// ↑ 퍼블릭은 누구나 사용가능하다.라는 뜻
	public static void main(String[] args) {
		
 Kh kh = new Kh();
 
 Student st = new Student();
 
 Car car = new Car();
 
 Object01 ob1 = new Object01();
 
 
	}

}
