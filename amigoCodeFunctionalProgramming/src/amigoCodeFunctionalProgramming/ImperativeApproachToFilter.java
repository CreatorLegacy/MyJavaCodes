package amigoCodeFunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ImperativeApproachToFilter {

	static class Person {
		private final String name;
		private final Gender gender;

		public Person(String name, Gender gender) {
			this.gender = gender;
			this.name = name;
		}

		@Override
		public String toString() {
			return this.name + " " + this.gender;
		}

	}

	enum Gender {
		MALE, FEMALE
	}

	public static void main(String[] args) {
		System.out.println("Imperative approach");

		List<Person> pl = List.of(new Person("yugal", Gender.MALE), new Person("mohit", Gender.MALE),
				new Person("ankita", Gender.FEMALE), new Person("manas", Gender.MALE),
				new Person("apurvi", Gender.FEMALE));

		List<Person> sortMale = new ArrayList<Person>();
		List<Person> sortFemale = new ArrayList<Person>();

		for (Person person : pl) {
			if (person.gender.equals(Gender.FEMALE))
				sortMale.add(person);
			else
				sortFemale.add(person);
		}

		System.out.println(sortMale);
		System.out.println(sortFemale);

		System.out.println("declarative approach");

		// create object of stream ,then filter and collect the objects and then use
		// list to convert into list

		// predicate is an interface that takes one boolean value
		Predicate<Person> pr = person -> (person.gender.equals(Gender.MALE));

		List<Person> ll = pl.stream().filter(pr/* person->person.gender.equals(Gender.MALE) */)
				.collect(Collectors.toList());
		System.out.println(ll);

		// printing each member
		ll.forEach(System.out::println);

	}

}
