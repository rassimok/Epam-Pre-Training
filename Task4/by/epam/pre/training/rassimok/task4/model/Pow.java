package by.epam.pre.training.rassimok.task4.model;

public class Pow {

	public static double countPowIter(final double x, int n) {
		double pow = 1;
		if (n == 0) {
			pow = 1;
		} else if (n > 0) {
			for (int i = 0; i < n; i++) {
				pow *= x;
			}
		} else {
			for (int i = 0; i < -n; i++) {
				pow *= x;
			}
			pow = 1 / pow;
		}
		return pow;
	}

	public static double countPowRecur(double x, int n) {
		if (n == 0) {
			return 1;
		} else if (n > 0) {
			return x * countPowIter(x, n - 1);
		} else {
			return 1 / countPowRecur(x, -n);
		}
	}
}
