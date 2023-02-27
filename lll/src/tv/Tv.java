package tv;

public interface Tv {
	void setVolume(int volume);
	void setChannel(int channel);
	void turnOff();
	void turnOn();
	
	
	
	int MAX_VOLUME = 40;
	int MIN_VOLUME = 0;
	int MAX_CHANNEL = 255;
	int MIN_CHANNEL = 5;
	
	
	
	

}
