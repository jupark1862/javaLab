package sec02.exam04_default_method;

public interface RemoteControl {
	
	void turnOn();
	void turnOff();
	void setVolume(int Volume);

	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("����ó���մϴ�.");
			
		}else {
			System.out.println("���������մϴ�.");
		}
	}
		static void changeBattery() {
			System.out.println("�������� ��ȯ�մϴ�.");
		
	}
}
