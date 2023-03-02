package tv04;

public class Tv {
	
	
	boolean power;
	int channel;
	
	void power() {
		
		power = !power;
		if (power)
			System.out.println("전원을 켭니다");
		else
			System.out.println("전원을 끕니다");
	}
	
	void channelUp() {
		++channel;
		System.out.println("현재 채널 : " + channel);
	}
	void channelDown() {
		--channel;
		System.out.println("현재 채널 : " + channel);
	}
  
}
