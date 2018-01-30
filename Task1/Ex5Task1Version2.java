
public class Ex5Task1Version2 {

	public static void main(String[] args) {

		int N = 12315;

		int sum = 0;
		int mult = 1;

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

		System.out.println(sum);
		System.out.println(mult);

	}

}
