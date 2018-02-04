import java.util.ArrayList;

public class NumbersInWords {

	public static final ArrayList<String> HUNDREDS_ARRAY = new ArrayList<String>();
	public static final ArrayList<String> DECADES_ARRAY = new ArrayList<String>();
	public static final ArrayList<String> FROM_ONE_TO_NINETEEN_ARRAY = new ArrayList<String>();

	static {
		// init arrays
		HUNDREDS_ARRAY.add("");
		HUNDREDS_ARRAY.add("сто");
		HUNDREDS_ARRAY.add("двести");
		HUNDREDS_ARRAY.add("триста");
		HUNDREDS_ARRAY.add("четыреста");
		HUNDREDS_ARRAY.add("пятьсот");
		HUNDREDS_ARRAY.add("шестьсот");
		HUNDREDS_ARRAY.add("семьсот");
		HUNDREDS_ARRAY.add("восемьсот");
		HUNDREDS_ARRAY.add("девятьсот");

		DECADES_ARRAY.add("");
		DECADES_ARRAY.add("1");
		DECADES_ARRAY.add("двадцать");
		DECADES_ARRAY.add("тридцать");
		DECADES_ARRAY.add("сорок");
		DECADES_ARRAY.add("пятьдесят");
		DECADES_ARRAY.add("шестьдесят");
		DECADES_ARRAY.add("семьдесят");
		DECADES_ARRAY.add("восемьдесят");
		DECADES_ARRAY.add("девяносто");

		FROM_ONE_TO_NINETEEN_ARRAY.add("");
		FROM_ONE_TO_NINETEEN_ARRAY.add("один");
		FROM_ONE_TO_NINETEEN_ARRAY.add("два");
		FROM_ONE_TO_NINETEEN_ARRAY.add("три");
		FROM_ONE_TO_NINETEEN_ARRAY.add("четыре");
		FROM_ONE_TO_NINETEEN_ARRAY.add("пять");
		FROM_ONE_TO_NINETEEN_ARRAY.add("шесть");
		FROM_ONE_TO_NINETEEN_ARRAY.add("семь");
		FROM_ONE_TO_NINETEEN_ARRAY.add("восемь");
		FROM_ONE_TO_NINETEEN_ARRAY.add("девять");
		FROM_ONE_TO_NINETEEN_ARRAY.add("десять");
		FROM_ONE_TO_NINETEEN_ARRAY.add("одиннадцать");
		FROM_ONE_TO_NINETEEN_ARRAY.add("двенадцать");
		FROM_ONE_TO_NINETEEN_ARRAY.add("тринадцать");
		FROM_ONE_TO_NINETEEN_ARRAY.add("четырнадцать");
		FROM_ONE_TO_NINETEEN_ARRAY.add("пятнадцать");
		FROM_ONE_TO_NINETEEN_ARRAY.add("шестнадцать");
		FROM_ONE_TO_NINETEEN_ARRAY.add("семьнадцать");
		FROM_ONE_TO_NINETEEN_ARRAY.add("восемьнадцать");
		FROM_ONE_TO_NINETEEN_ARRAY.add("девятнадцать");
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
			return HUNDREDS_ARRAY.get(numerals[0]) + " "
					+ FROM_ONE_TO_NINETEEN_ARRAY.get(numerals[1] * 10 + numerals[2]);
		} else {
			return HUNDREDS_ARRAY.get(numerals[0]) + " " + DECADES_ARRAY.get(numerals[1]) + " "
					+ FROM_ONE_TO_NINETEEN_ARRAY.get(numerals[2]);
		}
	}
}
