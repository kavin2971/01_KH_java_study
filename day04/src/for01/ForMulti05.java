package for01;

public class ForMulti05 {

	public static void main(String[] args) {
		// 
		for(int dan=2; dan<=9; dan++) {
			System.out.println(dan+"단");
			for (int i=1; i<=9; i++) {
				
				System.out.println(dan+"*"+ i + "="+dan*i);
			}
			System.out.println();
			
		}
	}

}
 // 갯수가 정해진 경우 for문 몇번을 도시오. 몇씩 증가시키시오.
