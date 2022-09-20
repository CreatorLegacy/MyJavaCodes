
public class ArmstrongNumberSumupto250 {

	public static void main(String[] args) {
		for (int i = 1; i <= 250; i++) {
			if (giveArmstrong(i))
				System.out.println(i);
		}

	}

	private static boolean giveArmstrong(int i) {
		int temp = i;
		int no = 0;
		do {
			int r = temp % 10;
			no +=  getPower(r, countDigit(i));
			temp = temp / 10;
		} while (temp != 0);

		if (no == i)
			return true;

		return false;
	}

	private static int countDigit(int i) {
		int counter = 0;
		do {
			counter++;
			i = i / 10;
		} while (i != 0);

		return counter;// here promotion of int to double is happening for method pow
	}

	private static int getPower(int r, int count) {
		if (count == 0)
			return 1;
		int res = 1;
		do {
			count--;
			res *= r;
		} while (count != 0);
		return res;
	}

}
