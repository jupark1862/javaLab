package example;

public class SumAvg {
	public static void main(String[] args) {
		int sum = 0;
		double avg = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			avg = i;
		}
		System.out.println("1~100 ÇÕ°è: "+sum);
		System.out.println("Æò±Õ: "+(sum/avg));
	}
}
