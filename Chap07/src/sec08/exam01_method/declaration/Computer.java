package sec08.exam01_method.declaration;

public class Computer {
	//Ŭ������ ���
	//1. �ʵ�
	//2. ������
	//3. �޼ҵ�
	int sum1(int[] values) {
		int sum =0;
		for (int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	int sum2(int... values) {
		int sum = 0;
		for(int i:values) {
			sum += i;
		}
		return sum;
	}
}
