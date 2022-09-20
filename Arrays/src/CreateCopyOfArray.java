import java.util.Arrays;

public class CreateCopyOfArray {

	public static void main(String[] args) {
		
		/**1st Method**/
		
		int i[]= {1,5,47,2,651};
		int copy[]=i;// pointing to the same object
		System.out.println(Arrays.toString(copy));

		/**2nd Method**/
		int[] copy2 = Arrays.copyOf(i, i.length);
		System.out.println(Arrays.toString(copy2));
		
		int[] copyHalf = Arrays.copyOfRange(i, 0, 2);// excluding the last index
		System.out.println(Arrays.toString(copyHalf));


	}

}
