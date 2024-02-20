package review_kawakubo;

import java.util.Scanner;

/*
 * 川久保コメント
 * パスワードといえども数値である必要はないので
 * 文字で扱ってもいいかと思います。
 * そうすると桁数に関係なく解けるようになるはずです。
 * 
 * Bの問題当たりが解けだしたら汎用的につくれないか
 * 挑戦してみるのもいいかもしれませんね。
 */
public class Ex212_B_別解1 {

	private static final String WEAK = "Weak";
	private static final String STRONG = "Strong";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String pass = sc.next();
		if (isAllSameNumber(pass)) {
			System.out.println(WEAK);
		} else if (isCyclic(pass)) {
			System.out.println(WEAK);
		} else {
			System.out.println(STRONG);
		}
		sc.close();
	}

	private static boolean isAllSameNumber(String pass) {
		char c1 = pass.charAt(0);
		char c2;
		for (int i = 1; i < pass.length(); i++) {
			c2 = pass.charAt(i);
			if (c1 != c2) {
				return false;
			}
			c1 = c2;
		}
		return true;
	}
	private static boolean isCyclic(String pass) {
		char c1 = pass.charAt(0);
		char c2;
		for (int i = 1; i < pass.length(); i++) {
			c2 = pass.charAt(i);
			if (((int)c1 + 1) % 10 != (int)c2 % 10) {
				return false;
			}
			c1 = c2;
		}
		return true;
	}
}
