package by.epam.pre.training.rassimok.task4.model;

public class RassimokMath {
	// countSumDigits ITERATION AND RECURSIVE
	public static int countSumDigitsIter(int nonNegativeNomber) {
		int sum = 0;
		while (nonNegativeNomber > 0) {
			sum += nonNegativeNomber % 10;
			nonNegativeNomber /= 10;
		}
		return sum;
	}

	public static int countSumDigitsRecur(int nonNegativeNomber) {
		if (nonNegativeNomber == 0) {
			return 0;
		}
		return nonNegativeNomber % 10 + countSumDigitsIter(nonNegativeNomber / 10);
	}

	// checkSumDigitsNEqualsNomberS ITERATION AND RECURSIVE
	public static boolean checkSumDigitsNEqualsNomberSIter(int N, int S) {
		while (N > 0) {
			if (S < 0) {
				return false;
			}
			S -= N % 10;
			N /= 10;
		}
		return N == S;
	}

	public static boolean checkSumDigitsNEqualsNomberSRecur(int N, int S) {
		if (S < 0) {
			return false;
		}
		if (N > 0) {
			return checkSumDigitsNEqualsNomberSRecur(N / 10, S - N % 10);
		} else {
			return N == S;
		}

	}
	// countPow ITERATION AND RECURSIVE

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
	// countFibonacciByN ITERATION AND RECURSIVE

	public static int countFibonacciByNIter(int naturalNumber) {
		int fN = 0;
		int firstF = 0;
		int secondF = 1;
		if (naturalNumber == 1) {
			fN = 0;
		} else if (naturalNumber == 2) {
			fN = 1;
		} else {
			for (int i = 3; i <= naturalNumber; i++) {
				fN = firstF + secondF;
				firstF = secondF;
				secondF = fN;
			}
		}
		return fN;
	}

	public static int countFibonacciByNRecur(int naturalNomber) {
		return naturalNomber == 1 ? 0
				: naturalNomber == 2 ? 1
						: countFibonacciByNRecur(naturalNomber - 2) + countFibonacciByNRecur(naturalNomber - 1);
	}
}
