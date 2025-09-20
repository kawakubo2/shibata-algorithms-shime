package review_kawakubo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex412_B_kawakubo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		// Tの文字列をSetへ変換
		Set<Character> spr = new HashSet<>();
		for (Character c : t.toCharArray()) {
			spr.add(c);
		}
		// S文字列の大文字の直前の文字をSetへ変換
		Set<Character> sub = new HashSet<>();
		for (int i = 1; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				sub.add(s.charAt(i - 1));
			}
		}
		// subの要素がすべてsprに含まれているか判定
		boolean ans = isSubSet(sub, spr);
		System.out.println(ans ? "Yes" : "No");

		sc.close();
	}

	/*
	 * subの要素がすべてsprに含まれているかを判定
	 * 含まれていればtrue、含まれていなければfalseを返す
	 */
	public static boolean isSubSet(Set<Character> sub, Set<Character> spr) {
		for (Character c : sub) {
			if (!spr.contains(c))
				return false;
		}
		return true;
	}
}
