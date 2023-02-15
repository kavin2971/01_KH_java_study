package array04;

import java.lang.reflect.Array;

public class Array03 {

	public static void main(String[] args) {
		
		int [] array = {34,25,23,35,44,28,13,11,8,2,66,88};
		
		System.out.println("배열갯수 : "+Array.getLength(array));
		int max = array[0];
		int min = array[0];
		
		for (int i=1; i<array.length; i++) {
		 if(max<array[i]) { max=array[i];}
			
		 else if(min>array[i]) {min=array[i];}
		}
		
		System.out.println("높은숫자 : "+max);
		System.out.println("낮은숫자 : "+min);
	}

}
