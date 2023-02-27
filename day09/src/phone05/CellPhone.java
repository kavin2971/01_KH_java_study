package phone05;

public class CellPhone extends Phone {
	String sendMessage;
	boolean game;
	boolean power;
	
	void power () {
		power = !power;
		if(power)
		System.out.println("전원 On");
		else
			System.out.println("전원 Off");
	}
	void sendMessage (){
		System.out.println("메세지를 보냈습니다");
	}
	void getMessage (){
		System.out.println("메세지가 왔습니다");
	}
	public void game () {
		game = !game;
		if(game)
		System.out.println("게임을 시작합니다");
		else
			System.out.println("게임을 종료합니다");
		
	}

}
