package langPackage03.stringMethod;

import java.util.Arrays;

public class _11_StringEx11 {

	public static void main(String[] args) {
		// 
		
		String text = "홍길동 - 아무개 - 이순신 - 강감찬";
		String[] name = text.split("-");
		System.out.println(Arrays.toString(name));
		
		for (String i : name)
			System.out.print(i+", ");
		
		for (int i=0; i<name.length; i++) {
			if(i < name.length-1)
			System.out.print(name[i] + ", ");
			else
				System.out.println(name[i]);
		}
		System.out.println();
		
		String str = "";
		for(int i=0; i<name.length; i++) {
			str += (i==0) ? name [i] : ", " + name[i];
		}
		System.out.println(str);

	}

}
