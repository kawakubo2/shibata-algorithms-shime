package review;

import java.util.Scanner;

public class Ex146_B {

	//https://atcoder.jp/contests/abc146/tasks/abc146_b
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("動かす個数:");
		int num = sc.nextInt();
		
		System.out.println("動かす文字列:");
		char[] s = sc.next().toCharArray();
		
		for(int i = 0; i < s.length; i++) {
			s[i] = (char) ('A' + ((s[i] + num) - 'A') % 26);
		}
		
		System.out.println(String.valueOf(s));
		sc.close();	
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
