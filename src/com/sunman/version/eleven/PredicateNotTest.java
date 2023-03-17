package com.sunman.version.eleven;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotTest {

	public PredicateNotTest() {
		
		List<Integer> numbers = List.of(4,78,1,25,33);
		Predicate<Integer> evenNumPredicate = number -> number%2 == 0;
		
		numbers.stream().filter(evenNumPredicate).forEach(System.out :: println);//Give Even Num
		System.out.println("-----------------");
		numbers.stream().filter(evenNumPredicate.negate()).forEach(System.out :: println);//Give odd Num
		System.out.println("-----------------");
		numbers.stream().filter(PredicateNotTest::isEven).forEach(System.out::println);//Can not use negate on method.
		System.out.println("-----------------");
		numbers.stream().filter(Predicate.not(PredicateNotTest::isEven)).forEach(System.out::println);//So predicate.not use.
	}
	
	private static boolean isEven(Integer number) {
		return (number%2 == 0);
	}

}
