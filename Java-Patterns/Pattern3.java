package org.catmanscodes.patterns;

import java.util.Scanner;

public class Pattern3 {

//	Input: 5
//	Output:
//
//	*****
//	****
//	***
//	**
//	*

	public static void main(String[] args) {

		final Scanner sc = new Scanner(System.in);

		final int no = sc.nextInt();

		for (int row = 1; row <= no; row++) {
			for (int col = 1; col <= no + 1 - row; col++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		sc.close();

	}

}