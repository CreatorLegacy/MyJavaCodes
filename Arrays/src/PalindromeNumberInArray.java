import java.util.Scanner;

public class PalindromeNumberInArray {

	private static boolean checkPalindrome(int i) {
		int pal = 0;
		int temp = i;
		do {
			int r = temp % 10;
			pal = pal * 10 + r;
			temp = temp / 10;
		} while (temp != 0);

		if (i == pal)
			return true;
		else
			return false;
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
			boolean val = checkPalindrome(input[i]);
			if (val)
				System.out.println(input[i]);
		}

	}

}
