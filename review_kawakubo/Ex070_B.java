package review_kawakubo;

import java.util.Scanner;

public class Ex070_B {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int t = Math.max(Math.min(b, d) - Math.max(a, c), 0);
		System.out.println(t);

		scanner.close();

	}

}
