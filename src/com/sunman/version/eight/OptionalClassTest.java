package com.sunman.version.eight;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class OptionalClassTest {
	
	/* This is used as Null Reference. Treat as empty collection without null. */
	
	public OptionalClassTest() {
		test();
	}
	
	private void test() {
		
		List<String> fruits = List.of("banana", "mango");
		Predicate<String> pridicate = fruit -> fruit.startsWith("m");
		fruits.stream().filter(pridicate).forEach(System.out::println);
		
		Optional<String> optional =  fruits.stream().filter(pridicate).findFirst();
		System.out.println(optional);
		System.out.println(optional.isEmpty());
		System.out.println(optional.isPresent());
		if(optional.isPresent())
			System.out.println(optional.get());
		
		
		/* Instead of using null, use Optional Empty*/
		Optional<String> car = Optional.of("BMW");
		System.out.println(car);
		
		/* Instead of using null, use Optional Empty*/
		Optional<String> empty = Optional.empty();
		System.out.println(empty);
		
	}

}
