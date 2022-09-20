
public class Search_the_specified_element_in_the_given_array_retrun_index_otherwise_retrun_negativeone {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60 };
		int ele = 70;

		int in = searchElementIndex(a, ele);
		if (in == -1)
			System.out.println("the no. is not present");
		else
			System.out.println("the no. is present at index " + in);
	}

	
	
	static int searchElementIndex(int[] a, int ele) {
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == ele)
				return i;
		}
		return -1;
	}

}