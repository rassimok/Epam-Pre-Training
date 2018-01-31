import java.util.ArrayList;

public class Ex5Task2 {

	public static void main(String[] args) {

		ArrayList<String> hundredsArray = new ArrayList<String>();
		hundredsArray.add("");
		hundredsArray.add("сто");
		hundredsArray.add("двести");
		hundredsArray.add("триста");
		hundredsArray.add("четыреста");
		hundredsArray.add("пятьсот");
		hundredsArray.add("шестьсот");
		hundredsArray.add("семьсот");
		hundredsArray.add("восемьсот");
		hundredsArray.add("девятьсот");

		ArrayList<String> decadesArray = new ArrayList<String>();
		decadesArray.add("");
		decadesArray.add("1");
		decadesArray.add("двадцать");
		decadesArray.add("тридцать");
		decadesArray.add("сорок");
		decadesArray.add("пятьдесят");
		decadesArray.add("шестьдесят");
		decadesArray.add("семьдесят");
		decadesArray.add("восемьдесят");
		decadesArray.add("девяносто");

		ArrayList<String> fromOneToNineteenArray = new ArrayList<String>();
		fromOneToNineteenArray.add("");
		fromOneToNineteenArray.add("один");
		fromOneToNineteenArray.add("два");
		fromOneToNineteenArray.add("три");
		fromOneToNineteenArray.add("четыре");
		fromOneToNineteenArray.add("пять");
		fromOneToNineteenArray.add("шесть");
		fromOneToNineteenArray.add("семь");
		fromOneToNineteenArray.add("восемь");
		fromOneToNineteenArray.add("девять");
		fromOneToNineteenArray.add("десять");
		fromOneToNineteenArray.add("одиннадцать");
		fromOneToNineteenArray.add("двенадцать");
		fromOneToNineteenArray.add("тринадцать");
		fromOneToNineteenArray.add("четырнадцать");
		fromOneToNineteenArray.add("пятнадцать");
		fromOneToNineteenArray.add("шестнадцать");
		fromOneToNineteenArray.add("семьнадцать");
		fromOneToNineteenArray.add("восемьнадцать");
		fromOneToNineteenArray.add("девятнадцать");

		int N = 911;
		int n3 = N % 10;
		N /= 10;
		int n2 = N % 10;
		N /= 10;
		int n1 = N;

		if (n2 == 1) {
			System.out.println(hundredsArray.get(n1) + " " + fromOneToNineteenArray.get(n2 * 10 + n3));
		} else {
			System.out
					.println(hundredsArray.get(n1) + " " + decadesArray.get(n2) + " " + fromOneToNineteenArray.get(n3));
		}

	}

}
