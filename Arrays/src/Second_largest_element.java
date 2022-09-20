
public class Second_largest_element {

	public static void main(String[] args) {
		int ar[] = { -5, -8, -5, 0, 1 };

		int big = ar[0], in = 0, secondBig = 0;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > big) {
				big = ar[i];
				in = i;
			}
		}

		for (int i = 0; i < ar.length; i++) {

			if (i == in)
				continue;

			if (ar[i] > secondBig)
				secondBig = ar[i];
		}

		System.out.println(secondBig);
	}

}
