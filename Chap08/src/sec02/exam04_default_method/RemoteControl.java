package sec02.exam04_default_method;

public interface RemoteControl {
	
	void turnOn();
	void turnOff();
	void setVolume(int Volume);

	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리합니다.");
			
		}else {
			System.out.println("무음해제합니다.");
		}
	}
		static void changeBattery() {
			System.out.println("건전지를 교환합니다.");
		
	}
}
