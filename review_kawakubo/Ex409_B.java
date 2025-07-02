package review_kawakubo;

import java.util.Scanner;
import java.util.TreeMap;

public class Ex409_B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = prepareArray(n, sc);

		TreeMap<Integer, Integer> map = new TreeMap<>();

		prepareCount(map, array);

		accumulate(map);

		for (int key : map.keySet()) {
			System.out.printf("%d: %d%n", key, map.get(key));
		}

		System.out.println(answer(map));

		sc.close();
	}

	public static int[] prepareArray(int n, Scanner sc) {

		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		return array;
	}

	/*
	 * 数値が何個あるか調べるメソッド
	 * 例) 3 1 2 5 1 2
	 * 1: 2
	 * 2: 2
	 * 3: 1
	 * 5: 1
	 */
	public static void prepareCount(TreeMap<Integer, Integer> map, int[] array) {
		for (int n : array) {
			if (!map.containsKey(n)) {
				map.put(n, 0);
			}
			map.put(n, map.get(n) + 1);
		}
	}

	/*
	 * prepareCountメソッドでカウントした件数を数値の大きい方から小さい方へと
	 * 加算していく
	 * 例) 3 1 2 5 1 2
	 * 1: 2
	 * 2: 2
	 * 3: 1
	 * 5: 1
	 * ---- 異常がprepareCountメソッドの結果
	 * これを数値の大きい順から値を小さい方を加算していく
	 * 5: 1 (5の個数)
	 * 3: 2 (5と3の個数)
	 * 2: 4 (5と3と2の個数)
	 * 1: 6 (5と3と2と1の個数)
	 */
	public static void accumulate(TreeMap<Integer, Integer> map) {
		int prev = 0;
		for (int key : map.descendingKeySet()) {
			map.put(key, map.get(key) + prev);
			prev += map.get(key);
		}
	}

	/*
	 * 5: 1 (5の個数)
	 * 3: 2 (5と3の個数)
	 * 2: 4 (5と3と2の個数)
	 * 1: 6 (5と3と2と1の個数)
	 * ------ 以上がaccumulateの結果
	 * これを順にキーと値を比較していき
	 * 値がキー以上になったところが答えになります
	 * つまり 2 < 4
	 * で答えは2です。
	 */
	public static int answer(TreeMap<Integer, Integer> map) throws IllegalStateException {
		for (int key : map.descendingKeySet()) {
			if (key <= map.get(key)) {
				return key;
			}
		}
		throw new IllegalStateException("存在しない状態");
	}
}
