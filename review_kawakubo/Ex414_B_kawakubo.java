package review_kawakubo;

import java.util.Scanner;

public class Ex414_B_kawakubo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// 文字を格納
		String[] characters = new String[n];
		// 文字の個数を格納
		long[] lengths = new long[n];

		for (int i = 0; i < n; i++) {
			characters[i] = sc.next();
			lengths[i] = sc.nextLong();
		}

		if (isConcatenatable(lengths)) {
			System.out.println(uncompress(n, characters, lengths));
		} else {
			System.out.println("Too Long");
		}

		sc.close();
	}

	private static boolean isConcatenatable(long[] charLengArray) {
		long total = 0L;
		for (long n : charLengArray) {
			total += n;
			if (total > 100)
				return false;
		}
		return true;
	}

	private static String uncompress(int n, String[] strings, long[] lengths) {
		StringBuffer sb = new StringBuffer(100);
		for (int i = 0; i < n; i++) {
			sb.append(strings[i].repeat((int) lengths[i]));
		}
		return sb.toString();

	}
}
