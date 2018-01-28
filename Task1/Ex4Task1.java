
public class Ex4Task1 {

	public static void main(String[] args) {

		int N = 1642;
		int p = 0;
		for (int i = 0; i < 3; i++) {
			int t1 = N % 10;
			N /= 10;
			int t2 = N % 10;
			if (t1 > t2) {
				p++;
			} else {
				p--;
			}
		}

		if (p == 3) {
			System.out.println("increasing");
		} else if (p == -3) {
			System.out.println("decreasing");
		} else {
			System.out.println("unordered");
		}
	}

}
