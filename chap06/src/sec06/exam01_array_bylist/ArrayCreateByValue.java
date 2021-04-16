package sec06.exam01_array_bylist;

public class ArrayCreateByValue {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		
		int sum = 0;
		//sum = scores[0] + scores[1] + scores[2];
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println(sum);
	}

}
