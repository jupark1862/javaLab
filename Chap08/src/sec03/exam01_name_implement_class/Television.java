package sec03.exam01_name_implement_class;

public class Television implements RemoteControl {
	//필드
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("티비를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("티비를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
			}else if(volume<RemoteControl.MIN_VOLUME) {
				this.volume=RemoteControl.MIN_VOLUME;
			}else {
				this.volume=volume;
			}
		
			System.out.println("현재TV볼륨:"+volume);
	}
	
	}
