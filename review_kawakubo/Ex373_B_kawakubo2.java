package review_kawakubo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex373_B_kawakubo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		long start = System.nanoTime();

		/*
		 * MapやSetや一度切り使用する場合は
		 * 構築コストがかかります。
		 * Listを使用する方法を紹介します。
		 * listのインデックスのところに
		 * 文字列の先頭からの位置を格納します
		 * 
		 *  0 --- Aの位置
		 *  1 --- Bの位置
		 * 
		 * 25 --- Zの位置
		 */
		List<Integer> list = new ArrayList<>();

		/*
		 * この部分がAからZまで順に位置を求め、
		 * 先頭からそれをリストに格納しています。
		 * A～Zまでは連続していて、かつ文字は数値
		 * 型であるため、インクリメント演算子で
		 * アルファベット順に取り出すことが可能です。
		 */
		for (char c = 'A'; c <= 'Z'; c++) {
			list.add(str.indexOf(c));
		}
		
		int count = 0;
		int prev = list.get(0); // Aの位置を取得
		for (int i = 1; i < list.size(); i++) {
			int current = list.get(i); // 次の文字の位置を取得
			count += Math.abs(prev - current); // 1つ前の位置との距離を求めて、総距離(count)に加算
			prev = current; // 現在の位置(current)を前の位置(prev)へ格納
		}
		long end = System.nanoTime();
		
		System.out.println(count);
		System.out.printf("処理時間: %dナノ秒%n", (end - start));

		sc.close();
	}

}
