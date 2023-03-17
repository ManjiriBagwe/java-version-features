package com.sunman.version.eight.javatechie.ft;

import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer>{

	public PredicateDemo() {
		//Calling in traditional way
		boolean result = this.test(10);
		System.out.println("1. Result : "+result);

		//Call with Lambda. You can remove implements Predicate<Integer> from class
		Predicate<Integer> predicate =	(t) -> {
			if(t % 2 == 0) {
				return true;
			}
			return false;
		};
		System.out.println("2. Result : "+predicate.test(5));


		//Call with Lambda. You can remove implements Predicate<Integer> from class
		Predicate<Integer> predicate1 =	t -> t % 2 == 0;
		System.out.println("3. Result : "+predicate1.test(25));

		System.out.println("------------------------");

		/* Using list and filter(Predicate)*/
		List<Integer> numbers = List.of(1,3,6,45,65,80);
		numbers.stream().filter(predicate1).forEach(System.out::println);
		//Or
		numbers.stream().filter(t -> t % 2 == 0).forEach(System.out::println);
	}

	@Override
	public boolean test(Integer t) {
		if(t%2 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		new PredicateDemo();
	}
}
