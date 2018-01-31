
public class Ex1Task2 {

	public static void main(String[] args) {

		int N = 355;
		int nomberOfHeads;
		int nomberOfEyes;

		if (N >= 300) {
			nomberOfHeads = 201 * 3 + 100 * 2 + (N - 300);
			nomberOfEyes = nomberOfHeads * 2;
		} else if (N >= 200) {
			nomberOfHeads = 201 * 3 + 2 * (N - 200);
			nomberOfEyes = nomberOfHeads * 2;
		} else {
			nomberOfHeads = (N + 1) * 3;
			nomberOfEyes = nomberOfHeads * 2;
		}

		System.out.println("nomberOfHeads: " + nomberOfHeads);
		System.out.println("nomberOfEyes: " + nomberOfEyes);
	}

}
