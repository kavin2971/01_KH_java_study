package tv;

public interface Tv {
	int MAX_CHANNEL = 500;
	int MIN_CHANNEL = 0;
	int MAX_VOLUME = 50;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int setVolume);
	void setChannel(int setChannel);

}
