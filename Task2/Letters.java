public class Letters {

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
		String s = "" + Character.toLowerCase(c);
		if ("aeiouy".contains(s)) {
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
