package review_kawakubo;

import java.util.Scanner;

public class Ex136_B_kawakubo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextInt();

		long startTime = System.nanoTime();
		long ans = getOddCount(n);
		long endtTime = System.nanoTime();
		System.out.println("処理時間: " + (endtTime - startTime));
		

		showAns(ans);

		sc.close();

	}

	public static long getOddCount(long n) {
		
		if (n > 1_000_000_000) throw new IllegalArgumentException("制約条件違反");

		long ans = 0;
		
		long order = 10;

		/*
		 * 川久保解説
		 * n = 12_345
		 * の場合についてコードを追っていきます。
		 * 変数orderは10, 1000, 100000
		 * のように100ずつ増やしていきます。(3)
		 * n >= order (1)
		 * が真であるということはまだ上位の桁があるので
		 * ans += order - order / 10 (2)
		 * でorderより小さい桁の個数を計算し加算します。
		 * 10の場合、        10 -     1 --->     9 (A)
		 * 1000の場合、    1000 -   100 --->   900 (B)
		 * 
		 * 問題は最上位桁です。
		 * n >= orderではない場合、
		 * 要するに、(4)のelseが上位桁の計算になります。
		 * 
		 * 最上位桁が奇数桁の場合のみ、変数ansに
		 * n - order / 10 + 1 (5)
		 * を加算します
		 * 今回のnは奇数桁なので
		 * 12_345 - 100_000 / 10 + 1 ---> 12_345 - 10_000 + 1 ---> 2_346 (C)
		 * 
		 * 
		 * (A), (B), (C)を加算すると3255
		 * となります。ちなみにnが偶数桁の場合
		 * (5)はfalseとなり、(6)は通過しません。
		 * 
		 */

		while (true) {
			if (n >= order) { // (1)
				ans += order - order / 10; // (2)
				order *= 100; // (3)
			} else { // (4)
				if (n >= order / 10 && n < order) { // (5)
					ans += n - order / 10 + 1; // (6)
				}
				break; // (7)
			}
		}
		
		return ans;
	}
	
	public static void showAns(long ans) {
		
		System.out.println(ans);
	}
}
