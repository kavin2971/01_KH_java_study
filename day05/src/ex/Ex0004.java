package ex;

public class Ex0004 {

	public static void main(String[] args) {
		
		int[] array = {55,11,33,54,66,33,22,25,62,63,36,57};
		System.out.println("배열갯수 : "+ array.length);
		int max = array [0];
		int min = array [0];
		
		for (int i=1; i<array.length; i++) {
			if (max < array[i]) {max = array[i];}
			else if (min > array[i]) {min = array[i];}
			
		}
		
		System.out.println("높은숫자 : "+max);
		System.out.println("낮은숫자 : "+min);
		}
	

	

}
