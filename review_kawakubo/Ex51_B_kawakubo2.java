package review_kawakubo;

import java.util.Scanner;

public class Ex51_B_kawakubo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int s = sc.nextInt();
		long sStart = System.nanoTime();
		System.out.println(shime(k, s));
		long sEnd = System.nanoTime();
		System.out.printf("処理時間: %dナノ秒%n", (sEnd - sStart));

		long kStart = System.nanoTime();
		System.out.println(kawakubo(k, s));
		long kEnd = System.nanoTime();
		System.out.printf("処理時間: %dナノ秒%n", (kEnd - kStart));
	
		sc.close();
	}
	private static int shime(int k, int s) {
		int ans = 0;
		for (int x = 0; x <= k; x++) {
			for (int y = 0; y <= k; y++) {
				if (x + y <= s && (s - x - y) <= k) {
					ans++;
				}
			}
		}
		return ans;
	}
	private static int kawakubo(int k, int s) {
		int ans = 0;
		for (int x = 0; x <= k; x++) {
			for (int y = 0; y <= k; y++) {
				int z = s - x - y;
				/*
				 * 川久保注
				 * kと比較してsが小さくなるほどこのbreakが効きだします。
				 * これも繰り返し回数を減らすのが必要になる理由です。
				 */
				if (z < 0) break; 
				if (z <= k) ans++;
			}
		}
		return ans;
	}
}