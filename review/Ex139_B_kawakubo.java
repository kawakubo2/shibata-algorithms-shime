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
		int t = 1;
		int i = 1;
		int total = a;
		Map<Integer, Integer> map = new LinkedHashMap<>();
		map.put(i, a); // 最初のタップ
		while (total < b) {
			if (map.get(i) > 0) {
				total += (a - 1); // タップ1個追加すると口が1個減り、新しいタップの数分増える
				map.put(i, map.get(i) - 1);
				map.put(++t, a);
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
