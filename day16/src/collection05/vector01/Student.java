package collection05.vector01;

public class Student {
	
	private String name;
	private int stuNo;
	
	//////////////////////////////////// construct 필드없는것 호출
	public Student() {
	}
	
    //////////////////////////////////// construct 필드있는것 호출
	public Student(String name, int stuNo) {
		
		this.name = name;
		this.stuNo = stuNo;
	}
	
	//////////////////////////////////// getters and setters 전체선택 호출
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	

}
