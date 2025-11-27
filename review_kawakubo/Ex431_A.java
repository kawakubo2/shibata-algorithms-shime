package review_kawakubo;

import java.util.Scanner;

public class Ex431_A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int b = sc.nextInt();

		// if (h > b) {
		// System.out.println((h - b));
		// } else {
		// System.out.println(0);
		// }

		System.out.println(requireBodyWeight(h, b));

		sc.close();
	}

	public static int requireBodyWeight(int h, int b) {
		return h > b ? h - b : 0;
	}
}
