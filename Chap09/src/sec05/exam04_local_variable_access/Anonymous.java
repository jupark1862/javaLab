package sec05.exam04_local_variable_access;

public class Anonymous {
	//�ʵ�
	private int field;
	
	//������
	
	//�޼ҵ�
	public void method(int arg1, int arg2) {
		int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
		arg1 = 20;
		
		//���ú��� calc�� �͸�����ü�� �븳��Ų��
		 Calculatable calc = new Calculatable() {
			 @Override
			 public int sum() {
				 int result = field + arg1 +arg2 + var1 + var2;
				 return result;
			 }
		 };
	}
}
