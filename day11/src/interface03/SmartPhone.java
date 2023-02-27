package interface03;

public class SmartPhone implements Phone, Searchable {
	int volume;
	

	@Override
	public void search(String msg) {
		System.out.println(msg+"를 검색한 결과입니다");
		
	}

	@Override
	public void turnOn() {
		System.out.println("전화를 받습니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("전화를 끊습니다");
		
	}

	@Override
	public void setVolume(int volume) {
		
		
		if ( MAX_VOLUME < volume){
			this.volume = Phone.MAX_VOLUME;
			System.out.println("최대볼륨값 50, 현재 볼륨 50 입니다");
			
		}else if ( volume < MIN_VOLUME ) {
			this.volume = Phone.MIN_VOLUME;
			System.out.println("최소볼륨값 0, 현재 볼륨 0 입니다");
		}else
			this.volume = volume;
		
		
	}

}
