package sec03.exam01_name_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {

		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.turnOff();
		System.out.println("------------");

		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(false);
		rc.turnOff();
	}
}