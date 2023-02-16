package student04;

public class StudentTest01 {

	public static void main(String[] args) {
		
	Student  st = new Student();
	st.studentName = "홍길동";
	System.out.println("이름은 "+st.studentName);
	
	st.studentNumber = "06-73071059";
	System.out.println("학번은 "+st.studentNumber);
	
	st.yearNumber = st.yearNumberUp(3);
			System.out.println("학년은 "+st.yearNumber+"학년");
	
	st.depName = "IT";
	System.out.println("학과는 "+st.depName);
	
	st.studyName = "자바의기초";
			System.out.println("강좌명은 "+ st.studyName);
	st.studentName = "홍길당";
	System.out.println("개명한 이름은 "+st.studentName);	

//	// 100개		
//	Student st2 = new Student();
//	Student st3 = new Student();
//	Student st4 = new Student();

//	String[] str = new String[100];
//	int[]num = new int [100];
//	
	Student[] st = new Student[100];
//	int count = 20230101;
	for(int i=0; i<st.length; i++) {
		st[i] = new Student();
		
	// st[i].studentNumber = 20230101+i;
	
	    
	

	
	}
		
	}
	
	}

}
