package sec07.exam03_field_polymorphism;

public class HankookTire extends Tire {
	//�ʵ�
	//������
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation); //�θ�����ڸ� ȣ���Ͽ� �θ�ü�� �����Ѵ�.
	}

	//�޼ҵ�
	@Override
	public boolean roll() {
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"HankookTire ����:" +(maxRotation-accumulatedRotation)+"ȸ");
			return true;
		}else {
			System.out.println("***"+location+"HanKookTire ��ũ ***");
			return false;
	}
	
	}
}
