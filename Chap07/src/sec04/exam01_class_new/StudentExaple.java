package sec04.exam01_class_new;

public class StudentExaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 다른Student 객체를 참조합니다.");
		System.out.println(s2);
	}

}
