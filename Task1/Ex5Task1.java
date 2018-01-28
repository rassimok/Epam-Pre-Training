
public class Ex5Task1 {

	public static void main(String[] args) {

		int N = 12315;
		int nOfDigits = nOfDigits(N);
		int sum = 0;
		int mult = 1;

		for (int i = 0; i < nOfDigits; i++) {
			int tmp = N % 10;
			sum += tmp;
			mult *= tmp;
			N /= 10;
		}
		System.out.println(sum);
		System.out.println(mult);

	}

	public static int nOfDigits(int N) {
		int count = 0;
		while (N > 0) {
			count++;
			N /= 10;
		}

		return count;
	}
}
