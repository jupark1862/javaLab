package example;

import java.util.Scanner;

public class SignPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inNum = 0;
		inNum = sc.nextInt();
		String grade = (inNum > 0) ? "���" : ((inNum < 0) ? "����" : "0");
		System.out.println("�Է��Ͻ� ���� " + grade + "�Դϴ�");
	}
}
