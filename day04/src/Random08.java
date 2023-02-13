
public class Random08 {

	public static void main(String[] args) {
		// 난수 발생 : random()
		//0.0 ~ 0.9999999999999999 까지
		     
		double random = Math.random();
		System.out.println(random);
		
		// 0.0 ~ 9.999999999
		random = Math.random()*10;
		System.out.println(random);
		
		//정수로 : 0~9
		int random2 = (int)(Math.random()*10);
		System.out.println(random2);
		
		//1~10
		random2 = (int)(Math.random()*10)+1;
		System.out.println(random2);
	}

}
