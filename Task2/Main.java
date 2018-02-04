
public class Main {

	public static void main(String[] args) {
		//Task 2 Exercise 1
		int N = 299;
		System.out.println("nomberOfHeads: " + Ex1Task2.getNomberOfHeads(N));
		System.out.println("nomberOfEyes: " + Ex1Task2.getNomberOfEyes(N));
		//Task 2 Exercise 2
		char c='x';
		System.out.println(c + " is vowel?(Version1) - " + Ex2Task2.isVowelVersion1(c));
		System.out.println(c + " is vowel?(Version2) - " + Ex2Task2.isVowelVersion2(c));
		System.out.println(c + " is vowel?(Version3) - " + Ex2Task2.isVowelVersion3(c));
		System.out.println(c + " is vowel?(Version4) - " + Ex2Task2.isVowelVersion4(c));
		//Task 2 Exercise 3
		System.out.println(Ex3Task2.getMood());
		//Task 2 Exercise 4
		System.out.println(DateByRassimok.getNextDayDate(1, 2, 1989));
		//Task 2 Exercise 5
		System.out.println(NumbersInWords.getNumbersInWords(67)); 
	}

}
