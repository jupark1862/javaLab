package example;

import java.util.Scanner;

public class ExitGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int inNum = 0;
		int a = 0;
		do {
			inNum = sc.nextInt();
			sum += inNum;
			System.out.println("�Է� : " + inNum + ", " + "�� : " + sum);
			a++;
			if (a == 5) {
				break;
			}
		} while (sum < 100);
		System.out.println("���α׷� ����!");
		sc.close();
	}

}
