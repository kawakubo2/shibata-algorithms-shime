package review_kawakubo;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex380_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		System.out.println(Arrays.asList(str.substring(1, str.length() - 1).split("\\|")).stream().map(s -> String.valueOf(s.length())).collect(Collectors.joining(" ")));

		/*
		 * 久しぶりにStream APIを使用しましたが、忘れていて苦戦しました。また可読性が低くなりました。
		 * 
		 * (1) str.substring(1, str.length() - 1)
		 *     文字列の先頭と末尾の"|"を除いた部分を取り出す。
		 * (2) .split("\\|")
		 *     "|"で分割し文字列の配列を生成する
		 * 	   ただし、"|"は正規表現でキーワードなので"\\"でエスケープする
		 * (3) Arrays.asList
		 *     (2)の結果をArras.asListでListへ変換する
		 * (4) .stream 
		 *     List型からStream型へ変換
		 * (5) map(s -> String.valueOf(s.length()))
		 *     文字列の文字数を求める(s -> s.length())と書くと怒られたのでString.valueOfで
		 *     IntegerからStringへ変換
		 * (6) collect(Collectors.joinning(" "))
		 *     各要素を半角空白で結合し文字列へ変換
		 */

		sc.close();
		
	}
}
