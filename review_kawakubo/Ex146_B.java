package review_kawakubo;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex146_B {

	//https://atcoder.jp/contests/abc146/tasks/abc146_b
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("動かす個数:");
		int num = sc.nextInt();
		
		System.out.println("動かす文字列:");
		String str = sc.next();
		List<Character> alpha = str.chars()
									.mapToObj(ch -> (char)c)
									.collect(Collectors.toList());
		
		/*
		 * Ex146_Bについてはよくできており、修正点はありません。
		 * 以下のようにList(本来はLinkedListがいいのですが)を使って
		 * 指定した回数分、先頭から要素を取り出し末尾に追加する方法あります。
		 */
		for (int i = 0; i < num; i++) {
			Character c = alpha.remove(0);
			alpha.add(c);
		}
		
		String answer = alpha.stream()
							.map(String::valueOf)
							.collect(Collectors.joining());
		System.out.println();
		
	}
	
	/**
	 * メモ
	 * ASCiiコード
	 * 連続した数字が割り振られている
	 * 'A' = 65
	 * 'Z' = 65 + 25 = 90
	 * まず文字をASCiiコードに変換する
	 * 
	 * 'A' = 65 なので-65してまず0にして+Nする
	 * 13個目なら
	 * A(65) - 65 = 0
	 * 0 + 13
	 *13 + 65 = 78 
	 * ASCiiコード78の文字に変換する
	 * 
	 *Z(90)
	 *90-65 =25
	 *25+13番目=38
	 *38 + 65 = 103
	 *103は範囲が超えてしまうので
	 * 38の段階で26を超えた場合は26で割った余りを取ってあげる　%26 = 12 
	 * 12 + 65 = 77 77='M'
	 */

}
