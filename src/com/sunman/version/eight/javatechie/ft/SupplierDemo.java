package com.sunman.version.eight.javatechie.ft;

import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String>{

	public SupplierDemo() {
		//Calling in traditional way
		System.out.println("1. "+this.get());

		//Call with Lambda, you can removed implements Supplier<String> from class
		Supplier<String> supplier = () -> {
			return "Hi there";
		};
		System.out.println("2. "+supplier.get());

		//Or Call with lambda- removing {}
		Supplier<String> supplier1 = () -> "Hi there";
		System.out.println("3. "+supplier1.get());

		/* Using list and findAny with orElse(Supplier)*/
		List<String> names = List.of("Manjiri","Sunetra","Rani","Pinka");
		//List<String> names = List.of();
		System.out.println("4. "+names.stream().findAny().orElseGet(supplier1));

		/* Using list and findAny with orElse(Supplier) directly*/
		System.out.println("5. "+names.stream().findAny().orElseGet(() -> "Hi there"));

	}

	@Override
	public String get() {
		return "Hi there";
	}

	public static void main(String[] args) {
		new SupplierDemo();
	}
}
