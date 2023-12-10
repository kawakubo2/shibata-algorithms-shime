package review;

import java.util.Scanner;

public class Ex164_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		String result = "No";

		while (true) {
			c -= b;
			if (c <= 0) {
				result = "Yes";
				break;
			}

			a -= d;
			if (a <= 0) {
				break;
			}
		}
		System.out.println(result);

		sc.close();
	}

}
