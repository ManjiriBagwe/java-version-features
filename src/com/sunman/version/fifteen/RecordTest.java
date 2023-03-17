package com.sunman.version.fifteen;

import java.util.Date;

public class RecordTest {

	/**
	 * Eliminate verbosity in creating java beans
	 * It creates Public accessor methods(Get), constructor, equals, hashcode, toString methods.
	 * You can create custom implementation if needed
	 * Compact Constructor are only allowed in Records
	 * You can add static fields, static initializers and static methods.
	 * Can not add instance variables and instance initializer(this.) .
	 * Instance method can be created.
	 */

	/* Compact Constructor */
	record account(String accNum, String name) {
		account {
			if(accNum == null)
				throw new IllegalArgumentException("Account Number can not be blank");
		}
	}
	
	record Person (String name, String email, Date dob) {}

	record Address(String street, String city, String state, int pincode) {
		Address(String street, String city, String state, int pincode) {
			this.street = street;
			this.city = city;
			this.state=state;
			this.pincode=pincode;
		}
		
		public String customInstanceMethod() {
			return "";
		}
	}

	public RecordTest() {
		Person p1 = new Person("Manjiri", "m@fjfj.com", new Date(System.currentTimeMillis()));
		Person p2 = new Person("Vedant", "v@fjfj.com", new Date(System.currentTimeMillis()));
		Person p3 = new Person("Shashank", "s@fjfj.com", new Date(System.currentTimeMillis()));
		Person p4 = new Person("Manjiri", "m@fjfj.com", new Date(System.currentTimeMillis()));

		System.out.println("P1 = "+p1);
		System.out.println("P1 and P4 = "+p1.equals(p4));
		System.out.println("P1 and P3 = "+p1.equals(p3));

	}

}
