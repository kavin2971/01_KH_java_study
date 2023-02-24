package staticVari02;

public class Document {
	
	static int count;
	String name;
	/*
	Document() {
		name = "제목없음 "+ ++count;
		System.out.println("문서 "+ name + "이 생성되었습니다");
	}
	*/
	Document() { //생성자 오버로딩
		this("제목없음"+ ++count);
	}	
	Document(String name){
		this.name = name;
		
		System.out.println("문서 "+ this.name + ".txt 생성되었습니다");
	}

}
