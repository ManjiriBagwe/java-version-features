package com.sunman.version.fourteen;

public class SwitchExpressionTest {

	public SwitchExpressionTest() {


		/* Old way */
		String dayOfWeek = "";
		int currentDay = 5;
		switch (currentDay) {
		case 0: dayOfWeek ="Sunday";break;
		case 1: dayOfWeek ="Monday";break;
		case 2: dayOfWeek ="Tuesday";break;
		case 3: dayOfWeek ="Wednesday";break;
		case 4: dayOfWeek ="Thursday";break;
		case 5: dayOfWeek ="Friday";break;
		case 6: dayOfWeek ="Saturday";break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + currentDay);
		}

		System.out.println("day of the week = "+dayOfWeek);


		/* New way. No break is required, it will come out of switch when meets condition. */
		String newDayOfWeek = "";
		int newCurrentDay = 2;

		newDayOfWeek = switch (newCurrentDay) {
		case 0 -> { 
			System.out.println("{} used to perform some complex logic. ");
			yield "Sunday"; 
		}
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "Thursday";
		case 5 -> "Friday";
		case 6 -> "Saturday";
		default ->
		throw new IllegalArgumentException("Unexpected value: " + currentDay);
		};

		System.out.println("new day of the week = "+newDayOfWeek);

	}

}
