package tv;



public class TvTest {

	public static void main(String[] args) {
		SmartTv st1 = new SmartTv();
		Tv tv = new Tv();
		tv.power();
		tv.channelUp();
		st1.search("netflix");
		st1.netflix("피지컬100");
		tv.power();
		
		

	}

}
