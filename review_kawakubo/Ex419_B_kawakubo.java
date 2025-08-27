package review_kawakubo;

import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class Ex419_B_kawakubo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		/*
		 * TreeMapはキーのソート順が保持されるMapです。
		 * この場合、キーがクエリ"1 x"のxで、値がその個数となります。
		 */
		TreeMap<Integer, Integer> map = new TreeMap<>();

		for (int i = 0; i < n; i++) {
			int q = sc.nextInt();
			if (q == 1) {
				int x = sc.nextInt();
				// xがキーに存在しないときはmapにキーxと値1を登録する
				if (!map.containsKey(x)) {
					map.put(x, 1);
					// xがキーに存在するときは、値に1を加算する
				} else {
					map.put(x, map.get(x) + 1);
				}
			} else {
				// 一番先頭にある(つまりキーが一番小さい)Entryを取り出す
				Map.Entry<Integer, Integer> entry = map.firstEntry();
				System.out.println(entry.getKey());
				// 値が1より大きい(つまり同じxが2つ以上ある場合は、値を1減らす)
				if (entry.getValue() > 1) {
					map.put(entry.getKey(), entry.getValue() - 1);
					// 値が1のときは、そのxは必要ないので削除する
				} else {
					map.remove(entry.getKey());
				}
			}
		}

		sc.close();

	}

}
