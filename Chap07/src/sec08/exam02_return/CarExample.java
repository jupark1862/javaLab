package sec08.exam02_return;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입 할 필요가 업습니다.");
		}else {
			System.out.println("gas를 주입하세요");
		}
	}

}
