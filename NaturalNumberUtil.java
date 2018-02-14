package by.epam.pre.training.rassimok.task3.model;

public class NaturalNumberUtil {

	public static int findMaxNumeral(int n) {
		int maxNumeral = 0;
		while (n > 0) {
			if (n % 10 > maxNumeral) {
				maxNumeral = n % 10;
			}
			n /= 10;
		}
		return maxNumeral;
	}

	public static boolean checkIsPalindrome(int n) {
		String number = Integer.toString(n);
		boolean isPalindrome = true;
		for (int i = 0; i < number.length(); i++) {
			if (number.charAt(i) != number.charAt(number.length() - i - 1)) {
				isPalindrome = false;
			}
		}
		return isPalindrome;
	}

	public static boolean checkIsPrime(int n) {
		boolean isPrime = true;
		double sqrtN = Math.sqrt(n);
		for (int i = 2; i <= sqrtN; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		if (n < 2) {
			isPrime = false;
		}
		return isPrime;
	}

	public static String findAllPrimeDividers(int n) {
		StringBuilder sb = new StringBuilder();
		double sqrtN = Math.sqrt(n);
		for (int i = 2; i <= sqrtN; i++) {
			if (n % i == 0 && checkIsPrime(i)) {
				sb.append(i).append(" ");
			}
		}
		return sb.toString();
	}

	public static int findGCD(int a, int b) {
		while (a != 0 && b != 0) {
			if (a > b) {
				a %= b;
			} else {
				b %= a;
			}
		}
		return a + b;
	}

	public static int findLCM(int a, int b) {
		return a * b / findGCD(a, b);
	}

	public static int countDifferentNumerals(int n) {
		String number = Integer.toString(n);
		int count = 0;
		for (int i = 0; i < 9; i++) {
			if (number.contains(Integer.toString(i))) {
				count++;
			}
		}
		return count;
	}

}
