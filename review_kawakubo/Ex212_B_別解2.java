package review_kawakubo;

import java.util.Scanner;
import java.util.function.BiPredicate;

/*
 * 川久保コメント
 * 実は別解1の2つのメソッド
 * isAllSameNumberとisCyclicは1か所を除いて全く同じです。
 * このような場合、高階関数を使うとスマートに解けます。
 */
public class Ex212_B_別解2 {

	private static final String WEAK = "Weak";
	private static final String STRONG = "Strong";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String pass = sc.next();
		if (isStrong(pass, (c1, c2) -> c1 != c2)) {
			System.out.println(WEAK);
		} else if (isStrong(pass, (c1, c2) -> ((int)c1 + 1) % 10 != (int)c2 % 10)) {
			System.out.println(WEAK);
		} else {
			System.out.println(STRONG);
		}
		sc.close();
	}

	private static boolean isStrong(String pass, BiPredicate<Character, Character> pred) {
		char c1 = pass.charAt(0);
		char c2;
		for (int i = 1; i < pass.length(); i++) {
			c2 = pass.charAt(i);
			if (pred.test(c1, c2)) {
				return false;
			}
			c1 = c2;
		}
		return true;
	}
}
