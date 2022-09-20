package functionalProgramming;

import java.util.List;
import java.util.function.Function;

public class Firstprogram {
	
	

	static int test(int r) {
		System.out.println("This is my first program");
		return 0;
	}

	static Function<Integer, Integer> nc = (r) -> r + 1;

	public static void main(String[] args) {
		System.out.println(nc.apply(0)); //for applying the parameter
		
		List<Integer> ll= List.of(10,50,520,014,65);
		
		ll.stream().forEach(System.out::println);
		
	}

}
