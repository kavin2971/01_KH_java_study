package tv03;

public class TvTest {

	public static void main(String[] args) {
		// Tv객체 생성
		Tv tv1 = new Tv();
		tv1.company = "삼성";
		tv1.model = "UHD 50인치";
		
		System.out.println("어느회사 tv인가요? " + tv1.company);
		System.out.println("모델명은 무엇인가요? " + tv1.model);
		
		tv1.power(); 
		
		tv1.channelUp();
		System.out.println("현재 채널은 " + tv1.channel + "입니다");
		
		tv1.channelUp();
		System.out.println("현재 채널은 " + tv1.channel + "입니다");
		
		tv1.channelDown();
		System.out.println("현재 채널은 " + tv1.channel + "입니다");
		
		tv1.volumeUp();
		System.out.println("현재 볼륨은 " + tv1.volume + "입니다");
		
		tv1.volumeDown();
		System.out.println("현재 볼륨은 " + tv1.volume + "입니다");
		
		tv1.power();
		tv1.power();
		System.out.println("=====================================");
		
		Tv2 tv2 = new Tv2();
		tv2.company = "LG";
		tv2.model = "HD 70인치";
		System.out.println("어느회사 tv인가요? " + tv2.company);
		System.out.println("모델명은 무엇인가요? " + tv2.model);
		
		tv2.power();
		int volume = tv2.volumeUp();
		System.out.println("현재 볼륨은 " + volume + "입니다");
		System.out.println("현재 볼륨은 " + tv2.volumeUp() + "입니다");
		
		volume = tv2.volumeDown();
		System.out.println("현재 볼륨은 " + volume + "입니다");
		System.out.println("=====================================");
		
		Tv3 tv3 = new Tv3();
		System.out.println("현재 볼륨은 " + tv3.volume(20) + "입니다");
		System.out.println("현재 볼륨은 " + tv3.volume(15) + "입니다");
		System.out.println("현재 볼륨은 " + tv3.volumeUp(10) + "입니다");
		System.out.println("현재 볼륨은 " + tv3.volumeDown(5) + "입니다");
	}
}
