package sec02.exam02_switch;

public class SwitchCharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';
		
	 if (grade =='A' || grade =='a') {
			System.out.println("우수회원입니다.");
		}else if(grade =='B' || grade =='b') {
			System.out.println("일반회원입니다.");
		}else {
			System.out.println("손님입니다.");
		}
	

}
}
