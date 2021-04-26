package sec06_throws;

public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			findClass();
			findClass2();
		}catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	public static void findClass(){
		Class clazz = Class.forName("java.lang.String2");
	}
	public static void findClass2(){
		Class clazz = Class.forName("java.lang.String2");
}
}
