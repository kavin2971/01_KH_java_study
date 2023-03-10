package collection.linkedList01;

import java.util.LinkedList;


public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(new Integer(99));
		list.add(Integer.valueOf(10));
		list.add(8);
		list.add(20);
		list.add(3);
		
		for (int i : list) System.out.println(i+" ");
		System.out.println();
		
		// 삭제
		list.remove(1);  // index 번호에 해당하는 노드 삭제
		for (int i : list) System.out.println(i+" ");
		System.out.println();
		
		list.remove();   // index 맨 앞에 삭제
		for (int i : list) System.out.println(i+" ");
		System.out.println();
		
		/*
		LinkedList<Student> stuList = new LinkedList<Student>();
		stuList.add(new Student("홍길동", 23));
		stuList.add(new Student("아무개", 23));
		
		for(Student i : stuList) System.out.println(i+ " ");
		System.out.println();
*/
	}

}
