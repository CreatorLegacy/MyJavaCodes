package functionalProgramming;

public class ExaOfReturningFunctionAndPassingFunctionAsArgument {

	static void sq(int r) {
		System.out.println(r * r);
	}

	static int dou(int r) {
		return 10;
	}

	static int sum(int x) {
		return x + x;
	}

	static int returnDou() {
		return dou(10);
	}

	public static void main(String[] args) {
		sq(sum(5));
	}

}
