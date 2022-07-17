package org.catmanscodes.patterns;

import java.util.Scanner;

//Input: 5
//Output:
//
//**********
//****XX****
//***XXXX***
//**XXXXXX**
//*XXXXXXXX*

public class Pattern10 {

	public static void main(String[] args) {

		final Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();

		for (int row = 1; row <= n; row++) {
			for (int stars = 1; stars <= ((2 * n) - ((row - 1) * 2)) / 2; stars++) {
				System.out.print("*");
			}
			for (int space = 1; space <= (row - 1) * 2; space++) {
				System.out.print("X");
			}

			for (int stars = 1; stars <= ((2 * n) - ((row - 1) * 2)) / 2; stars++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		sc.close();

	}
}