import java.util.Scanner;

public class Solution {

	public static void main(final String[] args) {

		final int i = 4;
		final double d = 4.0;
		final String s = "HackerRank ";

		final Scanner scan = new Scanner(System.in);

		final int j = scan.nextInt();
		final double e = scan.nextDouble();
		final String t = scan.nextLine();

		System.out.println(i + j);
		System.out.println(d + e);
		System.out.println(s + t);

		scan.close();
	}
	
}
