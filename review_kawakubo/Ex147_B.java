package review_kawakubo;

import java.util.Scanner;

public class Ex147_B {

	//https://atcoder.jp/contests/abc147/tasks/abc147_b
	public static void main(String[] args) {

		/*
		 * この問題もよく意図が理解されきちんと解けているので
		 * 特に指摘するところはありません。
		 * 強いて言えば、文字列を反転させて
		 * 2つの文字列の半分の位置まで比較するという方法もあります。
		 * 効率悪いですけど。。。
		 */

		Scanner sc = new Scanner(System.in);
		String comp1 = sc.nextLine();
		String comp2 = new StringBuffer(comp1).reverse().toString();
		
		int count = 0;
		for (int i = 0; i < comp1.length() / 2; i++) {
			if (comp1.charAt(i) != comp2.charAt(i)) count++;
		}
		
		System.out.println(count);
		sc.close();
	}

}
