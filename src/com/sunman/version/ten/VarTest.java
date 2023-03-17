package com.sunman.version.ten;

import java.util.List;

import com.sunman.version.eleven.StringUtilityTest;

public class VarTest {

	/**
	 * Local Variable Type Inference.
	 * Java compiler infers the ty[e of variable at compilation time.
	 * var can also be used in loops
	 * null can not be assign to var
	 * var is not a keyword.
	 * So best practice is use good variable name.
	 */
	public VarTest() {
		
		/* Old style */
		String firstName = "Manjiri"; //var use for String
		String lastName = "Bagwe";
		
		/*New way */
		var personFirstName = "Sunetra"; 
		var personLastName = "Chavan";
		
		var listName = List.of(firstName, lastName, personFirstName, personLastName); //var used for list
		listName.stream().forEach(System.out::println);
		
		for(var name : listName) {   //var used in loop
			System.out.println("Name : "+name);
		}
		
		var objStringUtil = new StringUtilityTest(); //var is used for any object, here for StringUtilityTest class
		System.out.println(objStringUtil);
		
	}

}
