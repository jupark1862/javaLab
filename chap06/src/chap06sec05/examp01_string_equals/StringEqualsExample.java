package chap06sec05.examp01_string_equals;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVal1 = "�Ź�ö";
		String strVal2 = "�Ź�ö";
		if (strVal1 == strVal2) {
			System.out.println("strVal1�� strVal2�� ������ ����");
		} else {
			System.out.println("strVal1�� strVal2�� ������ �ٸ�");
		}

		if (strVal1.equals(strVal2)) {
			System.out.println("strVal1�� strVal2�� ���ڿ��� ����");
		} else {
			System.out.println("strVal1�� strVal2�� ���ڿ��� �ٸ�");
		}

		String strVal3 = new String("�Ź�ö");
		String strVal4 = new String("�Ź�ö");

		if (strVal3 == strVal4) {
			System.out.println("strVal3�� strVal4�� ������ ����");
		} else {
			System.out.println("strVal3�� strVal4�� ������ �ٸ�");
		}
		if (strVal3.equals(strVal3)) {
			System.out.println("strVal3�� strVal4�� ���ڿ��� ����");
		} else {
			System.out.println("strVal3�� strVal4�� ���ڿ��� �ٸ�");
		}
	}
}
