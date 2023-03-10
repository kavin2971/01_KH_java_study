package collection.TreeSet;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {

		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		scores.add(89);
		scores.add(100);
		scores.add(45);
		scores.add(91);
		scores.add(75);
		
		System.out.println("가장 낮은 점수 : " + scores.first()+"점");
		System.out.println("가장 높은 점수 : " + scores.last()+"점");
		System.out.println("91점 보다 바로 아래 점수 : " + scores.lower(91)+"점");
		System.out.println("91점 보다 바로 위에 점수 : " + scores.higher(91)+"점");
		System.out.println("89점 과 같거나 보다 바로 아래 점수 : " + scores.floor(89)+"점");
		System.out.println("92점 과 같거나 보다 바로 아래 점수 : " + scores.floor(92)+"점");
		System.out.println("89점 과 같거나 보다 바로 위에 점수 : " + scores.ceiling(89)+"점");
		System.out.println("90점 과 같거나 보다 바로 위에 점수 : " + scores.ceiling(92)+"점");
		
	}

}
