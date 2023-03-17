package com.sunman.version.eight;

@FunctionalInterface
public interface FunctionalInterfaceTest {
	
	void abstarctMethod();
	
	default void defaultMethod1() {
		System.out.println("M1");
	}
	
	default void defaultMethod2() {
		System.out.println("M2");
	}
	
	default void defaultMethod3() {
		System.out.println("M3");
	}

}
