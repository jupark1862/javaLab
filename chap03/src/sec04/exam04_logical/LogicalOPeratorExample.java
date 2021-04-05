package sec04.exam04_logical;

import java.util.Scanner;

public class LogicalOPeratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			// TODO Auto-generated method stub

			System.out.println("3개의 정수를 입력하세요?");

			int n1, n2, n3, max, min;

			

			Scanner sc = new Scanner(System.in);

				n1 = sc.nextInt();

				n2 = sc.nextInt();

				n3 = sc.nextInt();

				System.out.println(n1);

				System.out.println(n2);

				System.out.println(n3);

				

				max = (n1>n2) ? n1 : (n2>n3 ? n2 : n3);

				min = (n1<n2) ? n1 : (n2<n3 ? n2 : n3);

				

				System.out.println("max="+max);

				System.out.println("min="+min);
		}
}