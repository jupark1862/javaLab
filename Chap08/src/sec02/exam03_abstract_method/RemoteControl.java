package sec02.exam03_abstract_method;

public interface RemoteControl {
	//���
	int AOX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// �߻�޼ҵ�
	abstract void tornOn();
	void turnOff();
	void setVolume(int volume);
	
}
