package sec04_multi_catch;

public class CatchByExceptionKindExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value1 = Integer.parseInt(data2);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű����� ���� �����մϴ�.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			System.out.println("�ٽ� �����ϼ���");
		}
	}

}
