package review;

import java.util.Scanner;

public class Ex326_B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = n; i <= 919; i++) {
			int a = i / 100;
			int b = (i / 10) % 10;
			int c = i % 10;

			if ((a * b) == c) {
				System.out.println(i);
				break;
			}
		}

		sc.close();
	}

}
