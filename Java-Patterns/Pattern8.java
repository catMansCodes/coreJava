package org.catmanscodes.patterns;

import java.util.Scanner;

public class Pattern8 {

//	Input : 5
//	Output:
//
//	*****
//	 ****
//	  ***
//	   **
//	    *

	public static void main(String[] args) {

		final Scanner sc = new Scanner(System.in);

		final int no = sc.nextInt();

		for (int row = 1; row <= no; row++) {

			for (int space = 1; space < row; space++) {
				System.out.print(" ");
			}

			for (int col = row; col <= no; col++) {
				System.out.print("*");
			}

			System.out.println("");
		}

		sc.close();

	}

}