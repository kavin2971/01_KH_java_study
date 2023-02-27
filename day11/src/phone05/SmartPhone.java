package phone05;

public class SmartPhone extends Phone {
	
	@Override
	void bell() {
		System.out.println("따르릉~ 따르릉~ 전화왔어요~");
	}
	@Override
	void hangup() {
		System.out.println("밀어서 전화받기");
	}
	@Override
	void hangout() {
		System.out.println("스크린 터치하여 통화종료");
	}
		
}


