package sec13.exam01_math;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] selectNumber = new int[6];
		Random random = new Random(5);
		System.out.println("���ù�ȣ: ");
		for(int i = 0; i<6; i++) {
			selectNumber[i] = random.nextInt(45)+1;
			System.out.print(selectNumber[i]+" ");
			
			//��÷��ȣ
			int[]winningNumber = new int[6];
			random = new Random(5);
			System.out.println("��÷��ȣ:");
			for(int i = 0; i<6; i++) {
				winningNumber[i] = random.nextInt(45)+1;
			}
		}
	}

}
