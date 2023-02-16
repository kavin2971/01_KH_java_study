package tv03;
// 반환형이 없는것
public class Tv {
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
	
	void channelUp() {
		++channel;  // 무조건 하나씩 증가
		
	}
	void channelDown() {
		--channel;
	}
	void volumeUp() {
		++volume;
    }
    void volumeDown() {
	    --volume;
	}

}
