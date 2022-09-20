import java.util.Scanner;

public class TwoD_Array {

	public static void main(String[] args) {

//		in 2-D array the memory allocation is done row wise

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the rows");
		int row = sc.nextInt();
		System.out.println("enter the column");
		int column = sc.nextInt();

		int input[][] = new int[row][column];

		System.out.println("enter the elements");
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {

				input[i][j] = sc.nextInt();
			}
		}

		// printing of the elements
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}

		int a[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
