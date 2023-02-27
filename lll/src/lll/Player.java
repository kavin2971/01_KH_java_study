package lll;

abstract class Player {

	//추상메서드 , 폼(양식) 
	
	// Player py = new Player(); 불가

		int currentPos;
		
		Player(){
			currentPos = 0;
			
		}
		abstract void play(int pos);
		abstract void stop();
		
	void play() {
		play(currentPos);
	}
	


	

}
