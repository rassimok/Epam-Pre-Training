
public class Main {

	public static void main(String[] args) {
		// Task 2 Exercise 1
		int N = 299;
		System.out.println("nomberOfHeads: " + Dragon.getNomberOfHeads(N));
		System.out.println("nomberOfEyes: " + Dragon.getNomberOfEyes(N));
		// Task 2 Exercise 2
		char c = 'v';
		System.out.println(c + " is vowel?(Version1) - " + Letters.isVowelVersion1(c));
		System.out.println(c + " is vowel?(Version2) - " + Letters.isVowelVersion2(c));
		System.out.println(c + " is vowel?(Version3) - " + Letters.isVowelVersion3(c));
		System.out.println(c + " is vowel?(Version4) - " + Letters.isVowelVersion4(c));
		// Task 2 Exercise 3
		System.out.println(MoodSensor.getMood());
		// Task 2 Exercise 4
		System.out.println(DateByRassimok.getNextDayDate(31, 12, 2000));
		// Task 2 Exercise 5
		NumbersInWords.run();
	}

}
