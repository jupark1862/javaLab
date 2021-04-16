package chap06sec05.examp01_string_equals;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVal1 = "신민철";
		String strVal2 = "신민철";
		if (strVal1 == strVal2) {
			System.out.println("strVal1과 strVal2는 참조가 같음");
		} else {
			System.out.println("strVal1과 strVal2는 참조가 다름");
		}

		if (strVal1.equals(strVal2)) {
			System.out.println("strVal1과 strVal2는 문자열이 같음");
		} else {
			System.out.println("strVal1과 strVal2는 문자열이 다름");
		}

		String strVal3 = new String("신민철");
		String strVal4 = new String("신민철");

		if (strVal3 == strVal4) {
			System.out.println("strVal3과 strVal4는 참조가 같음");
		} else {
			System.out.println("strVal3과 strVal4는 참조가 다름");
		}
		if (strVal3.equals(strVal3)) {
			System.out.println("strVal3과 strVal4는 문자열이 같음");
		} else {
			System.out.println("strVal3과 strVal4는 문자열이 다름");
		}
	}
}
