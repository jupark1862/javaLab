package sec05_try_with_resources;

public class TryWithResourceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		try{
			new FileInputStream("file.txt");
			fis.read(); // file.txt을 읽습니다.
			throw new Exception(); //예외를 강제로 발생시킨다.
			
		}catch(Exception e) {
			System.out.println("예외처리 코드가 발생되었습니다.");
		}finally {
			fis.close();
		}
	}

}
