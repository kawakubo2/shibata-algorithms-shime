package review_kawakubo;

import java.util.Scanner;

public class Ex210_B_02_kawakubo {

	private static final String[] names = { "Takahashi", "Aoki", "Suzuki" };
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		/*
		 * ここはint型の配列にすると、010を入力した場合
		 * 10が入力されとみなされ、次の入力を待っているはずです。
		 * String型でもいいかもしれませんね。
		 */
		// int[] s = new int[n];
		String s = sc.next();
		if (s.length() != n) {
			System.out.printf("%d個の数値を入力してください。%n", n);
		}
		
		// prepareArray(s, sc);
		judge(s);

		sc.close();
	}

	// public static void prepareArray(int[] s, Scanner sc) {
	// 	for (int i = 0; i < s.length; i++) {
	// 		s[i] = sc.nextInt();
	// 	}
	// }

	public static void judge(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				System.out.println(names[i % names.length]);
				break;
			}
		}
	}
}
