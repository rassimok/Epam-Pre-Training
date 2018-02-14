package by.epam.pre.training.rassimok.task3.model;

public class PerfectNumber {

	public static boolean checkIsPerfect(int n) {

		int sum = 1;
		int half = n / 2;
		for (int i = 2; i <= half; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		return n == sum;
	}

}
