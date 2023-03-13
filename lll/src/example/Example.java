package example;

import java.util.ArrayList;

public class Example {

	public static void main(String[] args) {
		
		ArrayList arraylist= new ArrayList();
		
		arraylist.add("banana");
		arraylist.add("apple");
		arraylist.add("tomato");
		arraylist.add("potato");
		arraylist.add("egg");
		arraylist.add("pasta");
		arraylist.add("pizza");
		arraylist.add("soup");
		
		arraylist.remove(7);
		
		System.out.println(arraylist.get(1));
		System.out.println(arraylist);
		
		arraylist.add("beat");
		
		System.out.println(arraylist);

	}

}
