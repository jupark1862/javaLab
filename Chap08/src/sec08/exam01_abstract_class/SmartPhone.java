package sec08.exam01_abstract_class;

public class SmartPhone extends Phone{
	

		public SmartPhone(String owner) {
			super(owner);
		}
		
		
		public void turnOff() {
			System.out.println("�������� ���ϴ�.");
		}
			
		public void internetSearch(){
			System.out.println("���ͳ� �˻��� �մϴ�.");
		}
		
}