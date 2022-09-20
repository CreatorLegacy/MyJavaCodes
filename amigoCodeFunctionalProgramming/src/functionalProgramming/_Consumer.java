package functionalProgramming;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

	static void print(int i) {
		System.out.println(i);
	}
	
	static Consumer<Integer> print1=(i)->System.out.println(i);
	
	static BiConsumer<Integer,Integer> print2=(i,j)->System.out.println(i+j);

	public static void main(String[] args) {
		print1.accept(10);
		print2.accept(10,20);
	}

}
