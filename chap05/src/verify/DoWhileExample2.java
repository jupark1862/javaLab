package verify;

import java.util.Scanner;

public class DoWhileExample2 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//1~100 사이의 수
		int ran = (int) (Math.random() * 100) + 1;
		int cnt = 0; 
		int inNum = 0;
		System.out.println("1부터 100사이의 숫자를 입력하세요");
		do {
			System.out.print(">");
			inNum=sc.nextInt();
			cnt++;
			if(inNum>ran) {
				System.out.println("작은수를 입력하세요");
			}else if(inNum<ran) {
				System.out.println("큰 수를 입력하세요");
			}
			}while(inNum!=ran);
		
		// ...
		System.out.println(cnt + "번만에 맞췄습니다.");
		sc.close();
	}
}