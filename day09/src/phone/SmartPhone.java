package phone;

public class SmartPhone extends CellPhone {
	boolean internet;
	boolean banking;
	boolean kakaotalk;
	boolean smarttv;
	
	void internet(){
		internet = !internet;
		if(internet) {
			System.out.println("인터넷을 시작합니다");
		}else { 
			System.out.println("인터넷을 종료합니다");
		}
	}	
	void banking(){
		banking = !banking;
		if(banking)
			System.out.println("인터넷뱅킹을 시작합니다");
		else 
			System.out.println("인터넷뱅킹을 종료합니다");
	}
	void kakaotalk(){
		kakaotalk = !kakaotalk;
		if(kakaotalk) {
			System.out.println("카카오톡을 시작합니다");
		}else { 
			System.out.println("카카오톡을 종료합니다");
		}
	}
	
	void smarttv() {
		smarttv = !smarttv;
		if(smarttv) {
			System.out.println("스마트TV를 시작합니다");
		}else { 
				System.out.println("스마트TV를 종료합니다");
			
		}
	}
		
}


