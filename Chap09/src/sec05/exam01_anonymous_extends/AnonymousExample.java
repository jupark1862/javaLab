package sec05.exam01_anonymous_extends;

public class AnonymousExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous anony = new Anonymous();
		
		//�͸��ڽİ�ü�� wake()�޼ҵ带 ����Ѵ�.
		anony.field.wake();
		
		//���ú����� �͸��ڽİ�ü�� ����Ѵ�.
		anony.method1();
		
		//�Ű������� �͸��ڽİ�ü�� ����Ѵ�
		anony.method2(new Person() {
			void study() {
				System.out.println("�����մϴ�.");
			}

			@Override
			void wake() {
			System.out.println("8�ÿ� �Ͼ�ϴ�.");
			study();
			}
			
		});
	}

}
