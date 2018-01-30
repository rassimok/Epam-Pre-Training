
public class Ex7Task1Version2 {

	public static void main(String[] args) {

		int N = 1313131;
		int nOfDigits = 7;
		int revers = 0;

		int tmp = N % 10;
		revers += tmp * Math.pow(10, nOfDigits - 1);
		N /= 10;

		tmp = N % 10;
		revers += tmp * Math.pow(10, nOfDigits - 2);
		N /= 10;

		tmp = N % 10;
		revers += tmp * Math.pow(10, nOfDigits - 3);
		N /= 10;

		tmp = N % 10;
		revers += tmp * Math.pow(10, nOfDigits - 4);
		N /= 10;

		tmp = N % 10;
		revers += tmp * Math.pow(10, nOfDigits - 5);
		N /= 10;

		tmp = N % 10;
		revers += tmp * Math.pow(10, nOfDigits - 6);
		N /= 10;

		tmp = N % 10;
		revers += tmp * Math.pow(10, nOfDigits - 7);

		System.out.println(revers);

	}

}
