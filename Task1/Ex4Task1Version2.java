
public class Ex4Task1Version2 {

	public static void main(String[] args) {

		int N = 9642;

		int n1 = N % 10;
		N /= 10;
		int n2 = N % 10;
		N /= 10;
		int n3 = N % 10;
		N /= 10;
		int n4 = N;

		boolean b = (n1 > n2 && n2 > n3 && n3 > n4) || (n1 < n2 && n2 < n3 && n3 < n4);

		System.out.println(b);

	}

}
