package by.epam.pre.training.rassimok.task4.model;

public class MyNumber {

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

	public static boolean checkSumDigitsNEqualsNomberSIter(int N, int S) {
		int sumDigitsN = 0;
		if (N != 0) {
			sumDigitsN = countSumDigitsIter(N);
		}
		return sumDigitsN == S;
	}

	public static boolean checkSumDigitsNEqualsNomberSRecur(int N, int S) {
		int sumDigitsN = 0;
		if (N != 0) {
			sumDigitsN = countSumDigitsRecur(N);
		}
		return sumDigitsN == S;
	}
}
