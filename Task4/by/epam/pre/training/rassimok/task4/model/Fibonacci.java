package by.epam.pre.training.rassimok.task4.model;

public class Fibonacci {

	public static int countFibonacciByNIter(int NaturalNumber) {
		int fN = 0;
		int firstF = 0;
		int secondF = 1;

		if (NaturalNumber == 1) {
			fN = 0;
		} else if (NaturalNumber == 2) {
			fN = 1;
		} else {
			for (int i = 3; i <= NaturalNumber; i++) {
				fN = firstF + secondF;
				firstF = secondF;
				secondF = fN;
			}
		}
		return fN;
	}

	public static int countFibonacciByNRecur(int NaturalNomber) {
		int fN = 0;
		if (NaturalNomber == 1) {
			fN = 0;
		} else if (NaturalNomber == 2) {
			fN = 1;
		} else {
			fN = countFibonacciByNRecur(NaturalNomber - 2) + countFibonacciByNRecur(NaturalNomber - 1);
		}
		return fN;
	}

}
