package sec03_try_catch_finally;

public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = null;
		String data2 = null;
		
		try {
			//예외발생 가능한 코드
			data1 = args[0];
			data2 = args[1];
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("실행 매개값의 수가 부족합니다.");
			
		}finally {
			System.out.println("다시 실행하세요");
		}
	}

}
