package sec07.exam03_field_polymorphism;

public class HankookTire extends Tire {
	//필드
	//생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation); //부모생성자를 호출하여 부모객체를 생성한다.
	}

	//메소드
	@Override
	public boolean roll() {
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"HankookTire 수명:" +(maxRotation-accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("***"+location+"HanKookTire 펑크 ***");
			return false;
	}
	
	}
}
