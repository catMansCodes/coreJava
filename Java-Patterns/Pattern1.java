package org.catmanscodes.patterns;

import java.util.Scanner;

public class Pattern1 {

//	Input: 5
//	Output :
//	*****

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		sc.close();
	}

}