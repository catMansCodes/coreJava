package org.catmanscodes.patterns;

import java.util.Scanner;

public class Pattern7 {

//	Input: 7
//	Output:
//	*******
//	*XXXXX*
//	*XXXXX*
//	*XXXXX*
//	*XXXXX*
//	*XXXXX*
//	*******

	public static void main(String[] args) {

		final Scanner sc = new Scanner(System.in);

		final int no = sc.nextInt();

		for (int row = 1; row <= no; row++) {

			for (int col = 1; col <= no; col++) {
				if (row == 1 || row == no) {
					System.out.print("*");
				} else {
					if (col == 1 || col == no) {
						System.out.print("*");
					} else {
						System.out.print("X");
					}
				}
			}

			System.out.println("");
		}

		sc.close();

	}

}