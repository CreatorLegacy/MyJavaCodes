
public class ColumnReverse {

	static void reverseColumn(int a[][]) {

		for (int i = 0; i < (a.length) / 2; i++) {
			for (int j = 0; j < a[0].length; j++) {
				int temp = a[i][j];
				a[i][j] = a[a.length - 1 - i][j];
				a[a.length - 1 - i][j] = temp;
			}
		}

	}

	public static void main(String args[]) {

		twoD_array_methods m1 = new twoD_array_methods();
		int r[][] = m1.readMat();
		reverseColumn(r);
		m1.dispMat(r);
	}
}
