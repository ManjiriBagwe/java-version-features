package com.sunman.version.eight;

import java.util.List;

public class FunctionalProgrammingTest {


	public FunctionalProgrammingTest() {

		testStandardApproch(List.of("dfd","sad"));
		testMethodReferance(List.of("dfdsfjldjf","bfblsdf"));
		printEvenNumberUsingFilter(List.of(2,45,8,65,25,3));
		System.out.println("----------------");
		
		printEvenNumberUsingFilterANDLamba(List.of(21,45,8,654,25,3));
		System.out.println("----------------");
		
		printOddNumberUsingFilterANDLamba(List.of(21,45,8,654,25,3));
		testChars(List.of("Java SPring","Java","Hibernet", "AWS"));
		
		System.out.println("----------------");
		testLength(List.of("Java SPring","Java","Hibernet", "AWS"));
		printSquareofEvenNumber(List.of(21,45,8,654,25,3));

		System.out.println("----------------");
		printLength(List.of("Java SPring","Java","Hibernet", "AWS"));
		System.out.println("----------------");
		printCubeOfOddNumbers(List.of(21,45,8,654,25,3));
	}


	private void testStandardApproch(List<String> list) {
		for(String name : list) {
			System.out.println("name : "+name);
		}
	}


	private void testMethodReferance(List<String> list) {
		/* Method ref - Class name :: Method Name(It should static method) */
		list.stream().forEach(System.out::println);
	}

	private void printEvenNumberUsingFilter(List<Integer> numbers) {
		numbers.stream().filter(FunctionalProgrammingTest::isEven).forEach(System.out::println);
	}

	private static boolean isEven(Integer number) {
		if (number%2 == 0) {
			return true;
		}
		return false;
	}

	/**
	 * 1. 	private static boolean isEven(Integer number) {
				return number%2 == 0;
			}
	 *  2. (Integer number) {
				return number%2 == 0;
			}

		3. (number) {
				return number%2 == 0;
			}

		4. number -> {
				return number%2 == 0;
			}

		5. number -> return number%2 == 0;

		6. If one parameter present, then () required. If one line of execution code present, then no {} required.
	 */

	private void printEvenNumberUsingFilterANDLamba(List<Integer> numbers) {
		numbers.stream().filter((number) -> number%2 == 0).forEach(System.out::println);
	}

	private void printOddNumberUsingFilterANDLamba(List<Integer> numbers) {
		numbers.stream().filter((number) -> number%2 != 0).forEach(System.out::println);
		//Or
		numbers.stream().filter((number) -> number%2 == 1).forEach(System.out::println);
	}

	private void testChars(List<String> courses) {
		courses.stream().filter(course -> course.contains("Java")).forEach(System.out::println);
	}

	private void testLength(List<String> courses) {
		courses.stream().filter(course -> course.length() < 4).forEach(System.out::println);
		System.out.println("Print Lenth");
		courses.stream().map(course -> course.length()).forEach(System.out::println);
	}

	private void printLength(List<String> courses) {
		courses.stream().map(course -> course+" - "+ course.length()).forEach(System.out::println);
	}

	private void printSquareofEvenNumber(List<Integer> numbers) {
		numbers.stream().filter((number) -> number%2 == 0).map(number -> number * number).forEach(System.out::println);
	}

	private void printCubeOfOddNumbers(List<Integer> numbers) {
		numbers.stream().filter(number -> number%2 ==1).map(number -> number * number * number).forEach(System.out::println);
	}
}
