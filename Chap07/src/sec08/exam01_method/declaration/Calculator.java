package sec08.exam01_method.declaration;

public class Calculator {
		// TODO Auto-generated method stub
		//1. �ʵ�
		Calculator(){
			
		}
		//2. ������
		//3. �޼ҵ�
		void powerOn() {
			System.out.println("�������մϴ�");
		}
		int plus(int x, int y) {
			int result = x + y;
			return result;
		}
		double divide(int x, int y) {
			double result = (double) x / y;
			return result;
		}
		void powerOff() {
			System.out.println("������ ���ϴ�.");
		}
	}
