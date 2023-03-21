package kim;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lotto_Re01 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        System.out.println("🧾 로또를 몇개 출력할까요?");
	        int number = scan.nextInt();
	        for (int i = 1; i < number; i++) {
	            로또구매();
	        }
	        int[] buyNumbers = 로또구매();
	        int[] winningNumbers = 로또추출();
	        for (int buyNumber : buyNumbers) {
	            for (int winningNumber : winningNumbers) {
	                if (buyNumber == winningNumber) {
	                    System.out.println("일치하는 번호는 " + winningNumber);
	                }
	            }
	        }
	    }

	    public static int[] 로또추출() {
	        Set<Integer> weeklyLotto = new HashSet<>();
	        int[] numbers=new int[6];
	        for (int i=0; weeklyLotto.size()<6; i++) {
	            int random=(int)(Math.random()*45+1);

	            if (!weeklyLotto.contains(random)) {
	                weeklyLotto.add(random);
	                numbers[i] = random;
	            }
	           
		           
	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	        System.out.println("🎉로또당첨번호🎉");
	    
	        System.out.println(Arrays.toString(numbers));
	        return numbers;
	    }

	    public static int[] 로또구매() {
	        Set<Integer> lottoBuy = new TreeSet<>();
	        for (int i=0; lottoBuy.size()<6;i++) {
	            int random=(int)(Math.random()*45+1);
	            lottoBuy.add(random);
	        }
	        System.out.println(lottoBuy);
	        return lottoBuy.stream().mapToInt(Integer::intValue).toArray();
	    }
}

