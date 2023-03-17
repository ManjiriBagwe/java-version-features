package com.sunman.version.eleven;

public class StringUtilityTest {

	public StringUtilityTest() {
		System.out.println(" ".isBlank()); //Return true/false.
		System.out.println(" LR ".strip());//Removes Leading and Trailing white spaces
		System.out.println(" LR ".stripLeading());  // Removes on Leading white spaces
		System.out.println(" LR ".stripTrailing()); //Removes on trailing white spaces
		System.out.println(" L R ".strip().replace(" ", "@")); //Replace white spaces with given char

		"Line1\nLine2\nLine3".lines().forEach(System.out::println);; //print Lines on next line

		System.out.println("ReduceString".transform(s -> s.substring(6))); //transform string to new - print string

		System.out.println("My name is %s and my age is %d".formatted("Manjiri", 40)); //Format string according to %

		/* Give proper message for null pointer */
		String sample = null;
		try {
			System.out.println("Sample : "+sample.isBlank()); // Cannot invoke "String.isBlank()" because "sample" is null.
		} catch (NullPointerException e) {
			System.out.println("Error Message : "+e.getMessage());
		}
	}

}
