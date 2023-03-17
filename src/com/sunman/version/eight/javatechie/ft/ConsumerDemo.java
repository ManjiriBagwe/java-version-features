package com.sunman.version.eight.javatechie.ft;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo implements Consumer<Integer>{

	public ConsumerDemo() {
		//Calling in traditional way
		accept(5);
		
		//Call with Lambda
		Consumer<Integer> consumer = (t) -> { System.out.println("Value : "+t); };
		consumer.accept(7);
		
		//Or Call with lambda- removing () and {}
		Consumer<Integer> consumer1 = t -> System.out.println("Value : "+t);
		consumer1.accept(74);

		/* Using list and forEach(Consumer)*/
		List<Integer> numbers = List.of(1,3,6,45,65);
		numbers.stream().forEach(consumer);
		
		//Or pass lambda expression directly
		numbers.stream().forEach(t -> System.out.println("Print : "+t));

	}

	@Override
	public void accept(Integer t) {
		System.out.println("Old way Value : "+t);

	}

	public static void main(String[] args) {
		new ConsumerDemo();
	}
}
