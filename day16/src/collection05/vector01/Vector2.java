package collection05.vector01;

import java.util.ArrayList;

public class Vector2 {

	public static void main(String[] args) {
		// 매개변수로 어떠한 객체도 모두 받겠다. 권장하지 않음
//		Vector v = new Vector();
		ArrayList v = new ArrayList();
		
		v.add(1);                      //정수로 입력해도 객체
		v.add(8.98);
		v.add("478");
		v.add(new Integer(8));
		v.add(new Double(6.89));
		v.add(new String("김정민"));
		
		
		Object obj = v.get(0);
		int i = (int)v.get(0);
		System.out.println(i);
		
		double d = (double)v.get(1);
		System.out.println(d);
		
		int i3 = Integer.parseInt((String)v.get(2));
		System.out.println(i3);
		
		int i4 = (int)v.get(3);
		System.out.println(i4);
		
		

	}

}
