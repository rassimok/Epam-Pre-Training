
public class Ex6Task1Version2 {

	public static void main(String[] args) {

		int N = 12315;

		double sum = 0;
		double mult = 1.0;

		int tmp = N % 10;
		sum += tmp;
		mult *= tmp;
		N /= 10;

		tmp = N % 10;
		sum += tmp;
		mult *= tmp;
		N /= 10;

		tmp = N % 10;
		sum += tmp;
		mult *= tmp;
		N /= 10;

		tmp = N % 10;
		sum += tmp;
		mult *= tmp;
		N /= 10;

		tmp = N % 10;
		sum += tmp;
		mult *= tmp;

		double average = sum / 6;
		double geoMean = Math.pow(mult, 1.0 / 6);
		System.out.println(average);
		System.out.println(geoMean);
	}

}
