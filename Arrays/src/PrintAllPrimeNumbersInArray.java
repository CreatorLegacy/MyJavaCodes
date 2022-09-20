import java.util.Scanner;

public class PrintAllPrimeNumbersInArray {

	private static boolean checkPrime(int i) {

		for (int j = 2; j <= i / 2; j++) {
			if (i % j == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = sc.nextInt();
		int input[] = new int[size];
		System.out.println("enter the elements inside the array");
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < input.length; i++) {
			boolean val = checkPrime(input[i]);
			if (val)
				System.out.println(input[i]);
		}
	}

}
