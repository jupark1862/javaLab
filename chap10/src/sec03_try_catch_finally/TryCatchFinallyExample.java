package sec03_try_catch_finally;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//���ܹ߻������� �ڵ�
			Class calzz = Class.forName("java.lang.String2");
		}catch(ClassNotFoundException e) {
			//����ó�� �ڵ�
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}

}
