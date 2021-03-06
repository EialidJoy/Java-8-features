package eialid.joy.javaLambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PersonJava7ExerciseSolutionUsingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> personsList=Arrays.asList(
				new Person("Eialid","Joy", 24),
				new Person("Mizanur","Rony", 23),
				new Person("Ashraf","Shahadat", 25),
				new Person("Khalid","Saifullah", 28),
				new Person("Mushfiqur","Sharot", 25)
				);
		
		// Task1- sort by last name
		Collections.sort(personsList, (p1,p2)-> p1.getLastName().compareTo(p2.getLastName()));
		
		
		// Task2- create a method to print all the lists sorted by last name
		
		printPersonsList(personsList, p->true, p->System.out.println(p));
		
		// Task3- create a method to prints all the people that have last name beginning with "S"
		System.out.println();
		System.out.println("Printing last name starts with S");
		printPersonsList(personsList, (p)-> p.getLastName().startsWith("S"),p->System.out.println(p));
		
		// Task4- create a method to prints all the people that have First name beginning with "M"
		System.out.println();
		System.out.println("Printing First name starts with M");
		printPersonsList(personsList, (p)->p.getFirstName().startsWith("M"), p->System.out.println(p));

	}
	
	private static void printPersonsList(List<Person> personsList, Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person p:personsList) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}
		}
		
	}

}







