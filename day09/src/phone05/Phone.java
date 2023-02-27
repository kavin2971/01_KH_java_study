package phone05;

public class Phone {
	String sendcall;
	String voice;
	
	void voice(String vc) {
		System.out.println("나 : "+vc);
	}
	void voice1(String vc1) {
		System.out.println("상대방 : "+vc1);
	}
	
	void sendcall(){
		System.out.println("전화를 걸고 있습니다");
		
	}
	String call;
	void getcall() {
		System.out.println("전화가 걸려오고 있습니다");
}

}
