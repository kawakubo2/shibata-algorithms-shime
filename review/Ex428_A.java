package review;

import java.util.Scanner;

public class Ex428_A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		int result = 0;

		sc.close();

		while (x > 0) {
			result += s * Math.min(a, x);
			x -= a + b;
		}
		System.out.println(result);
	}

}
