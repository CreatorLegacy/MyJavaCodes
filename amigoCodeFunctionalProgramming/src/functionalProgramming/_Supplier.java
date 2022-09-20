package functionalProgramming;

import java.util.function.Supplier;

public class _Supplier {
	
	static Supplier<Integer> s=()->10;
	/**No bi supplier because can't have two return type**/
	
	static int s1() {return 10;};

	public static void main(String[] args) {
		System.out.println(s.get());;
	}

}
