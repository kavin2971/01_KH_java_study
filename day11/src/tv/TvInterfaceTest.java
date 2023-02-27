package tv;

public class TvInterfaceTest {

	public static void main(String[] args) {
		SmartTv st = new SmartTv();
		st.turnOn();
		st.setVolume(80);
		st.setVolume(-1);
		st.seach("www.naver.com");
		st.setChannel(501);
		st.setChannel(-1);
		st.turnOff();
		

	}

}
