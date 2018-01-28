
public class Ex7Task1 {

	public static void main(String[] args) {

		int N = 1313131;
		int nOfDigits = nOfDigits(N);
		int revers=0;
		for (int i = 0; i < nOfDigits; i++) {
			int tmp=N%10;
			revers+=tmp*Math.pow(10, nOfDigits-i-1);
			N/=10;
		}
		System.out.println(revers);
		

	}

	public static int nOfDigits(int N) {
		int count = 0;
		while (N > 0) {
			count++;
			N /= 10;
		}

		return count;
	}
}
