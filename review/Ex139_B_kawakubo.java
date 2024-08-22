package review;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex139_B_kawakubo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// この式が？になっております
		// System.out.println((b-1+a-2)/(a-1));
		int t = 1; // タップを管理するための番号
		int i = 1; // 今どのタップを操作しているのかを管理するための変数
		int total = a; // 空きの口数
		Map<Integer, Integer> map = new LinkedHashMap<>(); // タップ番号(t)をキー、残り口数を値としたMap
		map.put(i, a); // 最初のタップ
		while (total < b) { // 空きの口数がbより小さい間繰り返す
			if (map.get(i) > 0) { // 操作中のタップの残り口数が0より大きい間繰り返す。
				total += (a - 1); // タップ1個追加すると口が1個減り、新しいタップの口数分増える
				map.put(i, map.get(i) - 1); // 操作中の残り口数を1つ減らす
				map.put(++t, a); // 新しいタップを追加する
				continue;
			}
			++i; // 追加したタップから口を埋めていく
		}
		System.out.println(map.size());

		printTap(map, total);

		sc.close();
	}

	private static void printTap(Map<Integer, Integer> map, int total) {
		for (int tapNumber: map.keySet()) {
			System.out.printf("タップNo: %2d 残りタップ数: %2d%n", tapNumber, map.get(tapNumber));
		}
		System.out.println("合計: " + total);
	}
}
