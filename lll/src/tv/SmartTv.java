package tv;

public class SmartTv implements Tv, Seachable, Mode{
	int volume;
	int channel;
	String mode;

	@Override
	public void Mode(String mode) {
	
			
		
		
	}

	@Override
	public void seach(String msg) {
		System.out.println(msg+"검색");
		
	}

	@Override
	public void setVolume(int volume) {
		if(MAX_VOLUME < volume) {
			this.volume = MAX_VOLUME;
			System.out.println("현재 볼륨은 40 이고, 최대 볼륨입니다");
		}else if(MIN_VOLUME > volume) {
			this.volume = MIN_VOLUME;
			System.out.println("현재 볼륨은 0 이고, 음소거 상태입니다");
		}else {
			this.volume = volume;
		}
			
		
	}

	@Override
	public void setChannel(int channel) {
		if(MAX_CHANNEL < channel) {
			this.channel = MAX_CHANNEL;
			System.out.println("현재 채널은 500 이고, 더이상 채널이 없습니다");
		}else if(MIN_CHANNEL > channel) {
			this.channel = MIN_CHANNEL;
			System.out.println("현재 채널은 5 이고, 더이상 채널이 없습니다");
		}else {
			this.channel = channel;
		}
		
	}

	@Override
	public void turnOff() {
		System.out.println("전원 꺼짐");
		
	}

	@Override
	public void turnOn() {
		System.out.println("전원 켜짐");
		
	}



	
	
	

}
