package amigoCodeFunctionalProgramming;

import java.util.function.Function;

public class BasicOfFunctionInterface {

	static int incByOneSimple(int i) {
		return ++i;
	}

	static Function<Integer, Integer> incByOneFunction = i -> ++i;

	public static void main(String[] args) {
		System.out.println("By imerative appraoch " + incByOneSimple(1));

		// calling function programming interface
		int res = incByOneFunction.apply(1);
		System.out.println("By Functional appraoch " + res);

	}

}
