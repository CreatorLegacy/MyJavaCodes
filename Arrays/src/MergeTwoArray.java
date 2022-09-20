import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the size of the array");
		int size = sc.nextInt();
		int input[] = new int[size];
		System.out.println("Enter the elements one by one inside the array");
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}

		System.out.println("Input the size of the second array");
		int size2 = sc.nextInt();
		int input2[] = new int[size2];
		System.out.println("Enter the elements one by one inside the array");
		for (int i = 0; i < input2.length; i++) {
			input2[i] = sc.nextInt();
		}
		int res[] = new int[size + size2];
		int x = 0;
		for (int i = 0; i < res.length; i++) {
			if (i < size)
				res[i] = input[i];
			else
				res[i] = input2[x++];
		}

		System.out.println(Arrays.toString(res));

	}

}
