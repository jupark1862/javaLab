package sec03_try_catch_finally;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//예외발생가능한 코드
			Class calzz = Class.forName("java.lang.String2");
		}catch(ClassNotFoundException e) {
			//예외처리 코드
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}

}
