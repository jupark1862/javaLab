package sec03.exam01_member_class_access;

public class A {
	//�ν��Ͻ� �ʵ�
	int[] intArray = new int[3];
	B field1 = new B();
	C field2 = new C();
	
	//�ν��Ͻ� �޼ҵ�
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	//���� �޼ҵ�
	static void method2() {
		//B var1 =  new B();
		C var2 = new C();
	}
	
	//�ν��Ͻ� ��� Ŭ����
	class B{	
	}
	
	//���� ��� Ŭ����
	static class C{
	}

}
