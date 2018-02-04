import java.util.Scanner;

public class NumbersInWords {

	public static final String[] HUNDREDS_ARRAY = new String[10];
	public static final String[] DECADES_ARRAY = new String[10];
	public static final String[] FROM_ONE_TO_NINETEEN_ARRAY = new String[20];

	static {
		// init arrays
		HUNDREDS_ARRAY[0] = "";
		HUNDREDS_ARRAY[1] = "сто";
		HUNDREDS_ARRAY[2] = "двести";
		HUNDREDS_ARRAY[3] = "триста";
		HUNDREDS_ARRAY[4] = "четыреста";
		HUNDREDS_ARRAY[5] = "пятьсот";
		HUNDREDS_ARRAY[6] = "шестьсот";
		HUNDREDS_ARRAY[7] = "семьсот";
		HUNDREDS_ARRAY[8] = "восемьсот";
		HUNDREDS_ARRAY[9] = "девятьсот";

		DECADES_ARRAY[0] = "";
		DECADES_ARRAY[1] = "1";
		DECADES_ARRAY[2] = "двадцать";
		DECADES_ARRAY[3] = "тридцать";
		DECADES_ARRAY[4] = "сорок";
		DECADES_ARRAY[5] = "пятьдесят";
		DECADES_ARRAY[6] = "шестьдесят";
		DECADES_ARRAY[7] = "семьдесят";
		DECADES_ARRAY[8] = "восемьдесят";
		DECADES_ARRAY[9] = "девяносто";

		FROM_ONE_TO_NINETEEN_ARRAY[0] = "";
		FROM_ONE_TO_NINETEEN_ARRAY[1] = "один";
		FROM_ONE_TO_NINETEEN_ARRAY[2] = "два";
		FROM_ONE_TO_NINETEEN_ARRAY[3] = "три";
		FROM_ONE_TO_NINETEEN_ARRAY[4] = "четыре";
		FROM_ONE_TO_NINETEEN_ARRAY[5] = "пять";
		FROM_ONE_TO_NINETEEN_ARRAY[6] = "шесть";
		FROM_ONE_TO_NINETEEN_ARRAY[7] = "семь";
		FROM_ONE_TO_NINETEEN_ARRAY[8] = "восемь";
		FROM_ONE_TO_NINETEEN_ARRAY[9] = "девять";
		FROM_ONE_TO_NINETEEN_ARRAY[10] = "десять";
		FROM_ONE_TO_NINETEEN_ARRAY[11] = "одиннадцать";
		FROM_ONE_TO_NINETEEN_ARRAY[12] = "двенадцать";
		FROM_ONE_TO_NINETEEN_ARRAY[13] = "тринадцать";
		FROM_ONE_TO_NINETEEN_ARRAY[14] = "четырнадцать";
		FROM_ONE_TO_NINETEEN_ARRAY[15] = "пятнадцать";
		FROM_ONE_TO_NINETEEN_ARRAY[16] = "шестнадцать";
		FROM_ONE_TO_NINETEEN_ARRAY[17] = "семьнадцать";
		FROM_ONE_TO_NINETEEN_ARRAY[18] = "восемьнадцать";
		FROM_ONE_TO_NINETEEN_ARRAY[19] = "девятнадцать";
	}

	private static int[] get3NumeralsFromNumber(int n) {
		int numerals[] = new int[3];
		for (int i = 2; i >= 0; i--) {
			numerals[i] = n % 10;
			n /= 10;
		}
		return numerals;
	}

	public static String getNumbersInWords(int n) {
		int numerals[] = get3NumeralsFromNumber(n);
		if (numerals[1] == 1) {
			return HUNDREDS_ARRAY[numerals[0]] + " " + FROM_ONE_TO_NINETEEN_ARRAY[numerals[1] * 10 + numerals[2]];
		} else {
			return HUNDREDS_ARRAY[numerals[0]] + " " + DECADES_ARRAY[numerals[1]] + " "
					+ FROM_ONE_TO_NINETEEN_ARRAY[numerals[2]];
		}
	}

	public static void run() {
		Scanner scan = new Scanner(System.in);
		int n = -1;
		while (true) {
			System.out.println("***Название числа в виде строки***");
			System.out.print("Введите число: ");
			if (scan.hasNextInt()) {
				n = scan.nextInt();
				if (n > 0 && n < 1000) {
					System.out.println("число в виде строки: " + getNumbersInWords(n));
				} else {
					n = -1;
					System.out.println("Нужно ввести число в диапазоне [1,999]");
				}
			} else {
				System.out.println("Нужно было ввести число от 1 до 999, а не всякую ерунду!!!пока пока");
				break;
			}
		}
		scan.close();

	}

}
