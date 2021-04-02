package sec02.exam01_byte;

public class GarbageValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		byte var1 = 125;
		int var2 = 125;
		
		System.out.println(var1);
		System.out.println(var2);

			for(int i=0; i<5;i++) {
				var1++;
				System.out.println(var1);
			}
	}

}