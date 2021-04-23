package sec05.exam01_anonymous_extends;

public class Anonymous {
	//�ʵ� �ʱⰪ���� �͸� �ڽİ�ü�� ����
	Person field = new Person() {
		void work() {
			System.out.println("����մϴ�.");
		}

		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}
	};
	
	void method1() {
		//���ú��������� �͸��ڽİ�ü�� ����
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å�մϴ�.");
			}
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
			}
		};
		localVar.wake();
	}
	void method2(Person person) {
		person.wake();
	}
}
