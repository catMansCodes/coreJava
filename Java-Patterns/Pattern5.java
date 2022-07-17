package org.catmanscodes.patterns;

import java.util.Scanner;

public class Pattern5 {

	// run 2 times with below 2 inputs
	// input 1 = 4,2
	// OP:
	// **
	// **
	// **
	// **

	// input 1 = 2,4
	// OP:
	// ****
	// ****
	public static void main(String[] args) {

		final Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();
		final int m = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

		sc.close();

	}

}