package com.sunman.version.fifteen;


public class TextBlockTest {

	/* This class used to simplify complex text strings.*/
	/**
	 * First Line has to be """ followed by line terminator
	 * Automatic alignment is done
	 * Trailing white space is striped.
	 * %s and %d things replace by string.
	 * 
	 */
	public TextBlockTest() {
		String sampleString = """
				"Line1"
				Lin3
				jkjdfjalkjds
				lfnds"hi"
				My Name is %s. My age is %d
				""";
		
		System.out.println(sampleString.formatted("Vedant", 11));
		
		
	}

}
