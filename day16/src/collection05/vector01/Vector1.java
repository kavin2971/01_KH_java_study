package collection05.vector01;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector vector = new Vector();            // 모든 객체의 자료형을 받을때
		ArrayList al = new ArrayList();
		
// 	     	    ↓ 원하는자료형              ↓앞에 <>넣어주면 해당위치에 <>을 입력
		List<Student> vlist = new Vector<>();    // 부모 자료형으로 형변환, Student객체만 받을때
		List<Student> alist = new ArrayList<>();
		
		vlist.add(new Student("홍길동", 480));    // 맨 끝에 삽입
		vlist.add(new Student("박길순", 80));
		vlist.add(new Student("최숙자", 30));
		vlist.add(new Student("이말동", 29));
		vlist.add(new Student("최철수", 48));
		
		alist.add(new Student("홍길동", 480));
		alist.add(new Student("박길순", 80));
		alist.add(new Student("최숙자", 30));
		alist.add(new Student("이말동", 29));
		alist.add(new Student("최철수", 48));
		
		vlist.remove(0); // index 0번 삭제
		
		for(int i=0; i<vlist.size(); i++) {
			Student student = vlist.get(i);   // index에 있는 객체 얻어오기
		                          //   ↑ index 번호
		
		System.out.println(student.getName() + "\t" + student.getStuNo());
		}
		System.out.println("--------------------------------");
		
		alist.clear();  // alist 전체 삭제
		
		if (!alist.isEmpty()) {
			for(int i=0; i<alist.size(); i++) {
				Student student = alist.get(i);
				System.out.println(student.getName() + "\t" + student.getStuNo());
				
			System.out.println("데이터가 없습니다");
			}
		}else
			System.out.println("데이터가 없습니다");
	}
	

	@Override
	public String toString() {
		return "Vector1 [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
