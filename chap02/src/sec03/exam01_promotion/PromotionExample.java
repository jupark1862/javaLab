package sec03.exam01_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte var1 = 10;
		int var2 = var1;
		int var3 = 10;
		byte var4 = (byte)var3;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		char charValue = '가';
		var3 = charValue;
		System.out.println("가의 유니코드=" + var3);
		
		var3 = 500;
		long longValue = var3;
				System.out.println(var3);
				
		double doubleValue = var3;
		System.out.println(var3);
	}

}
