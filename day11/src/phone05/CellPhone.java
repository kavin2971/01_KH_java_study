package phone05;

public class CellPhone extends Phone {

	@Override
	void bell() {
		System.out.println("띠리릭 띠리릭");
	}
	@Override
	void hangup() {
		System.out.println("폴더를 열어서 전화받기");
	}
	@Override
	void hangout() {
		System.out.println("폴더를 닫아 전화끊기");
	}
	
}
