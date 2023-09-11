/*
 * Programming_Exercise2_Tyler_Fuller.java
 * Tyler Fuller
 * 01261802
 * 09/11/2023
 */

public class Programming_Exercise2_Tyler_Fuller{
	
	public static void main(String[] args) {
		
		// Define constants
		final int ONE = 5;
		
		// Define variables
		int y, w;
		int x = 12;
		int z = 9;
		
		// Test if z is greater than 10, if so then compute this statement
		if (z > 10) {
			y = 5;
			w = x + y + ONE;
		}
		
		// Since z is not greater than 10, compute this statement
		else {
			y = 4;
			w = x + y + ONE;
		}
		
		// Print the result of w to the console
		System.out.println("w = " + w);
	}
}
