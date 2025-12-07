package review;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex431_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int n = sc.nextInt();
		int[] w = new int[n];

		// mapにはkeyにw配列のインデックス、ValueにそのW配列のインデックスが呼び出された回数をカウントする
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		prepare(map, w, sc);

		int q = sc.nextInt();

		// defaultはまずＸの最初の重さ
		int result = x;

		for (int i = 0; i < q; i++) {

			int idx = sc.nextInt();
			idx--;// 配列が0始まりなので一つ減らして合わせる
			// 配列の値が呼び出された回数が偶数ならその値分プラスに、奇数回ならその値分マイナスにする
			if ((map.get(idx) / 2) == 0) {
				result += w[idx];
				map.put(idx, map.get(idx) + 1);
			} else {
				result -= w[idx];
				map.put(idx, map.get(idx) + 1);
			}
			System.out.println(result);
		}

		sc.close();
	}

	public static void prepare(Map<Integer, Integer> map, int[] w, Scanner sc) {

		for (int i = 0; i < w.length; i++) {
			w[i] = sc.nextInt();
			map.put(w[i], 0);
		}
	}

}
