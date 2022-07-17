package org.catmanscodes.patterns;

import java.util.Scanner;

//input: 6
//output:
//
//******
//*   *
//*  *
//* *
//**
//*

public class Pattern9 {

	public static void main(final String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int n = sc.nextInt();

		for (int i = n; i >= 1; i--) {
			if (i == n) {
				for (int j = 1; j <= n; j++)
					System.out.print("*");
				System.out.println();
				continue;
			}
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		sc.close();
	}

}