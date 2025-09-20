package review_kawakubo;

import java.util.Scanner;

public class Ex419_B_kawakubo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// 制約でxは1～100なので要素を101個用意します。
		// 0番目は使用しません;
		int[] xs = new int[101];
		for (int i = 0; i <= 100; i++)
			xs[i] = 0; // 0で初期化

		int min = 101; // xは1～100なので101(クエリ"1 x"のxは必ず100以下)で初期化

		for (int i = 0; i < n; i++) {
			int q = sc.nextInt();
			if (q == 1) {
				int x = sc.nextInt();
				// xをインデックスとし、その要素に1加算する
				xs[x] += 1;
				if (x < min)
					min = x;
			} else {
				/*
				 * クエリが2の場合、minをインデックスとする要素を1減らす
				 * その要素が0以下であれば、最小値を探す
				 */
				System.out.println(min);
				xs[min]--;
				if (xs[min] <= 0) {
					for (int j = min; j <= 100; j++) {
						if (xs[j] > 0) {
							min = j;
							break;
						}
					}
				}
			}
		}

		sc.close();

	}

}
