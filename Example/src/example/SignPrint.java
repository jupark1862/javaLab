package example;

import java.util.Scanner;

public class SignPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inNum = 0;
		inNum = sc.nextInt();
		String grade = (inNum > 0) ? "양수" : ((inNum < 0) ? "음수" : "0");
		System.out.println("입력하신 값은 " + grade + "입니다");
	}
}
