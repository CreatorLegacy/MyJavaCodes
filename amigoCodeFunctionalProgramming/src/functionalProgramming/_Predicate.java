package functionalProgramming;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
	
	
	static BiPredicate<Integer,Integer> p2 = (x,y) -> x == y;
	
	static Predicate<Integer> p1 = x -> x == 20;

//	Predicate p = (x) -> (int) x > 20;// if we dont type cast it becomes Object type need to downcast


	/***** OR sim to *****/
	boolean p2(int x) {
		return (x == 20);
	}

	public static void main(String[] args) {
		System.out.println(p1.test(10));;
		System.out.println(p2.test(20,20));;

	}

}
