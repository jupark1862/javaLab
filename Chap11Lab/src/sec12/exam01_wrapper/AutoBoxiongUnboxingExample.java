package sec12.exam01_wrapper;

public class AutoBoxiongUnboxingExample {

	public static void main(String[] args) {
		//Auto-Boxing
		Integer obj = 100;
		System.out.println("obj: "+obj.intValue());
		
		//Auto-Unboxing
		int value = obj;
		System.out.println("value: "+value);
		
		//����� Auto-Unboxing
		int result = obj + 100;
		System.out.println("result: "+result);
	}

}
