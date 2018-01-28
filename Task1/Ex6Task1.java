
public class Ex6Task1 {

	public static void main(String[] args) {

		int N = 123456;
		int nOfDigits = nOfDigits(N);
		double sum = 0;
		double mult = 1.0;
		for (int i = 0; i < nOfDigits; i++) {
			int tmp = N % 10;
			sum += tmp;
			mult *= tmp;
			N /= 10;
		}

		double average = sum / nOfDigits;
		double geoMean = Math.pow(mult, 1.0 / nOfDigits);
		System.out.println(average);
		System.out.println(geoMean);


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
