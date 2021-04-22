package sec02.exam03_abstract_method;

public interface RemoteControl {
	//상수
	int AOX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상메소드
	abstract void tornOn();
	void turnOff();
	void setVolume(int volume);
	
}
