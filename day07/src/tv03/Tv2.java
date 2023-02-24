package tv03;

public class Tv2 {
	// tv의 속성
	String company;  // 아무것도 안넣었을때 디폴트값 : null
	String model;
	int channel;	 // 아무것도 안넣었을때 디폴트값 : 0
	int volume;
	boolean power;	 // 아무것도 안넣었을때 디폴트값 : false
	
	// 기능(메서드)
	void power() {
		power = !power;
		if(power == true) 
			System.out.println("tv를 켭니다");
		else
			System.out.println("tv를 끕니다");
	}
	int channelUp() {
		++channel;
		return channel;
	}
	int channelDown() {
		--channel;
		return channel;
	}
	int volumeUp() {
		++volume;
		return volume;
	}
	int volumeDown() {
		--volume;
		return volume;
	}
	int volumeStop() {
		volume = 0;
		return volume;
	}
}




