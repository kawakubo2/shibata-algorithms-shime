package review;

import java.util.Scanner;

public class Ex414_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// 文字を格納
		String[] c = new String[n];
		// 文字の個数を格納
		long[] l = new long[n];

		for (int i = 0; i < n; i++) {
			c[i] = sc.next();
			l[i] = sc.nextLong();
		}

		// int mojiCount = 0;
		String result = "";

		for (int i = 0; i < c.length; i++) {
			long count = l[i];
			for (long j = count; j > 0; j--) {
				result += c[i];
			}
		}

		if (result.length() > 100) {
			System.out.println("too long");
		} else {
			System.out.println(result);
		}

		sc.close();
	}

}
