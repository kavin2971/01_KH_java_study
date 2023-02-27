package tv;

public class SmartTv implements Tv, Seachable  {
	int volume;
	int channel;

	@Override
	public void seach(String msg) {
		System.out.println(msg+" 검색 ");
		
	}

	@Override
	public void turnOn() {
		System.out.println("전원을 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("전원을 끕니다");
		
	}

	@Override
	public void setVolume(int volume) {
		if (MAX_VOLUME < volume) {
			this.volume = Tv.MAX_VOLUME;
			System.out.println("최대 볼륨입니다 현재 채널은 "+this.volume);
		}else if (MIN_VOLUME > volume) { 
			this.volume = Tv.MIN_VOLUME;
			System.out.println("최소 볼륨입니다 현재 채널은 "+this.volume);
		}else {
			this.volume = volume;
		}
	}
		
	

	@Override
	public void setChannel(int channel) {
		if (MAX_CHANNEL < channel) {
			this.channel = Tv.MAX_CHANNEL;
			System.out.println("최대 채널입니다 현재 채널은 " +this.channel);
		}else if (MIN_CHANNEL > channel) {
			this.channel = Tv.MIN_CHANNEL;
			System.out.println("최소 채널입니다 현재 채널은 " +this.channel);
		}else {
			this.channel = channel;
		}
		
	}
	
	
}

