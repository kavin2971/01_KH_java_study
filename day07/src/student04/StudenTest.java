package student04;

public class StudenTest {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.CourseName("공공융합데이터");
		System.out.println("강좌명 : " + st1.CourseName);
		
		int grade = st1.gradeUp();
		System.out.println(grade + "학년");
		
		System.out.println("이름은 " + st1.name("이순삼"));
		
		st1.stuNum = 20210101;
		st1.major = "IT학과";
		System.out.println("학번은 " + st1.stuNum);
		System.out.println("학과는 " + st1.major);
		
		Student[] st = new Student[100];
		// int count = 20230101;
		for(int i=0; i<st.length; i++) {
			st[i] = new Student();
			st[i].stuNum = 20230101+i;
			// st[i].stuNum = count++;
			System.out.println(st[i].stuNum);
		}
	}
}






