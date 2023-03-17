package com.sunman.version.five;

import static java.lang.Math.PI;

public class StaticImportTest {

	public StaticImportTest() {

		/* Old way */
		int radius = 5;
		double areaCircle=0f;

		areaCircle = 2*Math.PI*radius*radius;
		System.out.println("areaCircle : "+areaCircle);

		/* New way - add class in import and directly use it - import static java.lang.Math.PI;*/

		areaCircle = 2*PI*radius*radius;
		System.out.println("New areaCircle : "+areaCircle);

	}
}
