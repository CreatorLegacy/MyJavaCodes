package amigoCodeFunctionalProgramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {

	static class Employee {

		int id;
		String name;
		double sal;

		public Employee(int id, String name, double sal) {
			super();
			this.id = id;
			this.name = name;
			this.sal = sal;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
		}

	}

	public static void main(String[] args) {

		List<Employee> ll = List.of(new Employee(101, "Suraj", 8245621), new Employee(102, "Mohan", 8245621),
				new Employee(103, "Kranti", 8245621), new Employee(104, "Mahesh", 8245621));

		Stream<Employee> dis = ll.stream().distinct();
		dis.forEach((e) -> System.out.println(e));
		
		System.out.println("-----------------");
		
		List<Employee> res= ll.stream().filter((e)->e.id>102).collect(Collectors.toList());
		
		res.stream().forEach(System.out::println);
		
		

	}

}
