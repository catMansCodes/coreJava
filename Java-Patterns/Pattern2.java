package org.catmanscodes.patterns;

import java.util.Scanner;

public class Pattern2 {

	// Pyramid Pattern
	// Input: 4
	// Output:
	// *
	// **
	// ***
	// ****

	public static void main(String[] args) {

		final Scanner sc = new Scanner(System.in);

		final int no = sc.nextInt();

		for (int i = 1; i <= no; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

		sc.close();

	}

}