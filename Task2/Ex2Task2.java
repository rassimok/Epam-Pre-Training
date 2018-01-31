import java.util.HashSet;
import java.util.Scanner;

public class Ex2Task2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		char c = s.charAt(0);

		System.out.println(c + " is vowel?(Version1) - " + isVowelVersion1(c));
		System.out.println(c + " is vowel?(Version2) - " + isVowelVersion2(c));
		System.out.println(c + " is vowel?(Version3) - " + isVowelVersion3(c));
		System.out.println(c + " is vowel?(Version4) - " + isVowelVersion4(c));

	}

	public static boolean isVowelVersion1(char c) {
		c = Character.toLowerCase(c);
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isVowelVersion2(char c) {
		switch (Character.toLowerCase(c)) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'y':
			return true;
		default:
			return false;
		}
	}

	public static boolean isVowelVersion3(char c) {
		HashSet<Character> vowelsHashSet = new HashSet<Character>();
		vowelsHashSet.add('a');
		vowelsHashSet.add('e');
		vowelsHashSet.add('i');
		vowelsHashSet.add('o');
		vowelsHashSet.add('u');
		vowelsHashSet.add('y');
		if (vowelsHashSet.contains(Character.toLowerCase(c))) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isVowelVersion4(char c) {
		c = Character.toLowerCase(c);
		return Character.toString(c).matches("^(?i:[aeiouy]).*");
	}

}
