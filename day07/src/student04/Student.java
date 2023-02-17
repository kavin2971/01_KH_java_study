package student04;

public class Student {
	String name;
	int stuNum;
	int grade = 1; 
	String major;
	String CourseName;
	
	void CourseName(String CourseName1) {
		CourseName = CourseName1;
	}
	int gradeUp() {
		++grade;
		return grade;
	}
	String name(String name1) {
		name = name1;
		return name;
	}
	
	/*
	String CourseName(String CourseName1) {
		CourseName = CourseName1;
		return CourseName;
	}
	int gradeUp() {
		++grade;
		return grade;
	}
	String name(String name1) {
		name = name1;
		return name;
	}
	*/
	/*
	void CourseName(String CourseName1) {
		CourseName = CourseName1;
	}
	void gradeUp() {
		++grade;
	}
	void name(String name1) {
		name = name1;
	}
	*/
}
