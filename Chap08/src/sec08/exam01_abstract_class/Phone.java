package sec08.exam01_abstract_class;

public class Phone {
	//�߻� Ŭ������ ���� ���
	//�ʵ�
	public String owner;
	//������
	public Phone(String owner) {
		this.owner = owner;
	}
	//�߻�޼ҵ�
	public void turnOff() {}
	//�Ϲݸ޼ҵ�
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}
}
