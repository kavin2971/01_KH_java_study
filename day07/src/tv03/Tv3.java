package tv03;
//반환형이 있는것
public class Tv3 {
	//tv 속성           
	String company;    // 아무것도 안넣을때 디폴트값 : null
	String model;
	int channel;       // 아무것도 안넣을때 디폴트값 : 0
	int volume;
	boolean power;     // 아무것도 안넣을때 디폴트값 : false
	
	//기능 (method)
	void power() {
		power = !power;  //(true)를 넣으시요
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
	int volume(int volume1) {
		volume = volume1;
		return volume1;
	}
	int volumeUp(int volume1) { 
		volume += volume1;
		return volume;
    }
	int volumeDown(int volume1) {
		volume -= volume1;
		return volume;
	}
  
}
