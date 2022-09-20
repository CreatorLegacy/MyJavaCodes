package functionalProgramming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function // returns one value and takes one i/p
{
	static BiFunction<Integer, Integer, String> f1 = (x,y) -> {
		if (x > y)
			return "yugal";

		return "mohit";
	};

	static Function<Integer, Integer> f = (x) -> {
		if (x > 10)
			return 20;

		return 10;
	};

	static int f1(int x) {
		if (x > 10)
			return 20;
		else
			return 10;
	}

	public static void main(String[] args) {
		System.out.println(f.apply(10));
		System.out.println(f1.apply(10,20));

	}
}
