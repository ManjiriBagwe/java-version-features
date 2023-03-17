package com.sunman.version.five;

public class EnumTest {

	public EnumTest() {
		/* Old version standard way to represent an enumerated type was the int. */

		// int Enum Pattern - has severe problems!
		final int SEASON_WINTER = 0;
		final int SEASON_SPRING = 1;
		final int SEASON_SUMMER = 2;
		final int SEASON_FALL   = 3;


		int currentSeason = 1;

		switch(currentSeason) {
		case SEASON_WINTER :  System.out.println("Season is Winter");break;
		case SEASON_SPRING :  System.out.println("Season is Spring");break;
		case SEASON_SUMMER :  System.out.println("Season is Summer");break;
		case SEASON_FALL   :  System.out.println("Season is Fall");break;
		default 		   : System.out.println("No Season to print");

		}


		/* New way : New keyword 'enum' added. */
		enum Season { WINTER, SPRING, SUMMER, FALL }
		Season currentSeason1 = Season.SPRING;

		switch(currentSeason1) {
		case WINTER :  System.out.println("Season is Winter");break;
		case SPRING :  System.out.println("Season is Spring");break;
		case SUMMER :  System.out.println("Season is Summer");break;
		case FALL   :  System.out.println("Season is Fall");break;
		default 	: System.out.println("No Season to print");

		}
	}
}
