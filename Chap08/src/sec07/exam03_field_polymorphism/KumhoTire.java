package sec07.exam03_field_polymorphism;

public class KumhoTire extends Tire {
	//�ʵ�
	//������
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation); //�θ�����ڸ� ȣ���Ͽ� �θ�ü�� �����Ѵ�.
	}

	//�޼ҵ�
	@Override
	public boolean roll() {
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"KumhoTire ����:" +(maxRotation-accumulatedRotation)+"ȸ");
			return true;
		}else {
			System.out.println("***"+location+"Kumho ��ũ ***");
			return false;
	}
	
	}
}
