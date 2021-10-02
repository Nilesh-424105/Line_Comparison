package com.bridgelabz;

/**
 *  // Calculate Length Of Line
 */

import java.util.Scanner;

public class Line_Comparison {
	public static void main(String[] args) {
		System.out.println("Calculate Length Of Line: ");

		Scanner line = new Scanner(System.in);

		// Take Input From User For Line
		System.out.println("Enter the Value of x Co-ordinate 1st point: ");
		int x1 = line.nextInt();
		System.out.println("Enter the Value of y Co-ordinate  1nd point: ");
		int y1 = line.nextInt();
		System.out.println("Enter the Value of x Co-ordinate 2nd point: ");
		int x2 = line.nextInt();
		System.out.println("Enter the Value of y Co-ordinate 2nd point: ");
		int y2 = line.nextInt();

		// Calculate length of line
		double length_of_line1 = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
		System.out.println("length_of_line1 = " + length_of_line1);
	}

}
