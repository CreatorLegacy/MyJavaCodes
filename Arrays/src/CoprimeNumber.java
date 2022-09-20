
public class CoprimeNumber {

	public static void main(String[] args) {
		int[] ar = { 1, 5, 5, 3, 7, 2, 82, 3, 7 };

		for (int i = 0; i < ar.length; i++) {
			if ((i != ar.length - 1) && (checkPrime(ar[i]) && checkPrime(ar[i + 1])))
				System.out.println(ar[i] + " and " + ar[i + 1] + " are coprime numbers");
		}
	}

	private static boolean checkPrime(int i) {
		for (int j = 2; j < i / 2; j++) {
			if (i % j == 0)
				return false;
		}
		return true;
	}

}
