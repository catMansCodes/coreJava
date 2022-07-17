package org.catmanscodes.patterns;

import java.util.Scanner;

public class Pattern6 {

//	Input: 4
//	OP:
//	*XXX*
//	*XXX*
//	*XXX*
//	*XXX*

	public static void main(String[] args) {

		final Scanner sc = new Scanner(System.in);

		final int no = sc.nextInt();

		for (int row = 1; row <= no; row++) {
			System.out.print("*");
			for (int col = 1; col <= no - 1; col++) {
				System.out.print("X");
			}
			System.out.print("*");
			System.out.println("");
		}

		sc.close();

	}

}