package sec04.exam07_conditional;

public class ConditionalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 5.0;
		double y = 0.0;
		
		double z = 5 % y;
		
		if (Double.isNaN(z)) {
			System.out.println("0.0���� ���� �� �����ϴ�");
		} else {
					double result = z + 10;
					System.out.println("���=" + result);
		}
	}

}
