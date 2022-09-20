
public class MainRunner {

	public static void main(String[] args) {

		twoD_array_methods m1 = new twoD_array_methods();

		int x[][] = m1.readMat();
		System.out.println("orignal matrix");
		m1.dispMat(x);

		System.out.println("the biggest element in the matrix is" + m1.getBiggest(x));
		System.out.println("the sum of element in the matrix is" + m1.getSum(x));

		int result[] = m1.countEvenOdd(x);

		System.out.println("the count of odd no is " + result[0]);
		System.out.println("the count of even no is " + result[1]);

		System.out.println();
		System.out.println();
		
		/*
		 * // adding of the matrix
		 * 
		 * System.out.println("Enter elements for first matrix"); int ip1[][] =
		 * m1.readMat(); m1.dispMat(ip1);
		 * 
		 * System.out.println("Enter elements for second matrix"); int ip2[][] =
		 * m1.readMat(); m1.dispMat(ip1);
		 * 
		 * int r[][] = m1.addMat(ip1, ip2);
		 * 
		 * if (r != null) { System.out.println("added matrix"); m1.dispMat(r); }
		 */

		System.out.println();
		System.out.println();

		// transposing of matrix

	

		System.out.println("transposed matrix");
		int trans[][] = m1.transposeMat(x);
		m1.dispMat(trans);

		System.out.println();
		System.out.println();

		// row wise reverse

		System.out.println("reverse row matrix");
		int z[][] = m1.reverseRow(x);
		m1.dispMat(z);

		System.out.println();
		System.out.println();

		// column wise reverse

		System.out.println("reverse column matrix");
		m1.reverseColumn(x);
		m1.dispMat(x);
		
		
		
	}

}
