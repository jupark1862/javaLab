package sec05_try_with_resources;

public class TryWithResourceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		try{
			new FileInputStream("file.txt");
			fis.read(); // file.txt�� �н��ϴ�.
			throw new Exception(); //���ܸ� ������ �߻���Ų��.
			
		}catch(Exception e) {
			System.out.println("����ó�� �ڵ尡 �߻��Ǿ����ϴ�.");
		}finally {
			fis.close();
		}
	}

}
