import java.util.Scanner;

public class twoD_array_methods {

	int[][] readMat() {

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
		return input;
	}

	void dispMat(int[][] input) {
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}

	}

	int getBiggest(int[][] input) {

		int biggest = input[0][0];

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {

				if (input[i][j] > biggest)
					biggest = input[i][j];
			}
		}
		return biggest;
	}

	int getSum(int[][] input) {

		int sum = 0;

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {

				sum = sum + input[i][j];
			}
		}
		return sum;
	}

	int[] countEvenOdd(int[][] input) {

		int oc = 0, ec = 0;

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (input[i][j] % 2 == 0)
					ec++;
				else
					oc++;
			}
		}
		int result[] = { oc, ec };

		return result;
	}

	/*
	 * no of rows=a.length no of column=a[0].length
	 * 
	 * 
	 */

//	add two matrix

	int[][] addMat(int a[][], int b[][]) {

		if (a.length != b.length || a[0].length != b[0].length) {
			System.out.println("the martix can be added becuase of not being of same order");
			return null;
		}

		int result[][] = new int[a.length][a[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				result[i][j] = a[i][j] + b[i][j];
			}
		}

		return result;
	}

	// transpose

	int[][] transposeMat(int a[][]) {

		int result[][] = new int[a[0].length][a.length];// shifting the elements of columns to rows and vice-versa

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				result[i][j] = a[j][i];
			}
		}

		return result;
	}
	
	
	
	

	/* define the method to return smallest element */
//	how many prime no present in the matrix
	
	
 	
	
	
	

	// reverse row elements in the matrix

	int[][] reverseRow(int a[][]) {


		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < (a[0].length)/2; j++) {
				int temp=a[i][j];
				a[i][j]=a[i][a[0].length-1-j];
				a[i][a[0].length-1-j]=temp;
			}
		}
		return a;
	}
	
	void reverseColumn(int a[][]) {
		

		for (int i = 0; i < (a.length)/2; i++) {
			for (int j = 0; j < a[0].length; j++) {
				int temp=a[i][j];
				a[i][j]=a[a.length-1-i][j];
				a[a.length-1-i][j]=temp;
			}
		}

	}
	
	

	// rotate the matrix right and left

//	rotate right => first transpose and then perform rowWise Reverse
//	rotate left => first transpose and then perform columnWise Reverse

	int [] rowWiseBiggest(int a[][]) {
		
		int u[]=new int [a.length];// no of elements in that 2-D array
		
		for (int i = 0; i < a.length; i++) {
			int big=a[i][0];// here first element of the row will be stored in the matrix and re-initialized every time
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j]>big)
					big=a[i][j];
			}
		}
		return u;
	}
		
	
	
		int[] columnWiseBiggest(int d[][])  {
			
			int m[]=new int [d[0].length];// no of element in any row 
			
			for (int i = 0; i < d[0].length; i++) {
				int big=d[0][i];// here first element of the column will be stored in the matrix and re-initialized every time
				for (int j = 0; j < d.length; j++) {
					if(d[j][i]>big)
						big=d[j][i];
				}
			}
			return m;
		}
	
		void diagonalSwap(int a[][]) {// primary diagonal element to secondary element and vice versa
			
			int u[]=new int [a.length];
			
			for (int i = 0; i < a.length/2; i++) {
				int temp=a[i][i];				
			}
				
			}

		

}
