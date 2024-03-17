package review_kawakubo;

import java.util.Scanner;

public class Ex344_A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int result01 = str.indexOf("|");
		System.out.println("result01:  " + result01);
		
		int result02 = str.lastIndexOf("|");
		System.out.println("result02:  " + result02);
		
		//最初の|より前の文字列だけ抽出する
		String str01 = str.substring(0,result01);
		
		System.out.println(str01 + str.substring(result02 + 1));

		/*
		 * 川久保
		 * 特に指摘することがないので
		 * 文字を操作する方法で解いてみました。
		 */
		System.out.println(skip(str));

		sc.close();
	}

	public static String skip(String s) {
		boolean skip = false;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '|') {
				skip = !skip; // 最初 false ---> true, 2回目 true ---> false
				continue; // |自体は文字列自体には関係ないのでこれより下の処理はしない
			}
			if (!skip) sb.append(s.charAt(i));
		}
		return sb.toString();
	}

}
