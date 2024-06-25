package review_kawakubo;

import java.util.Arrays;
import java.util.Random;

public class Ex329_B_kawakubo {

	public static void main(String[] args) {

		int n = 500;
		int maxInt = 1_000;

		// 手入力するのは大変なので、乱数を使って配列を作る関数を使用しています。
		int[] x = generateIntArray(n, maxInt);

		long start = System.nanoTime();

		/*
		 * 川久保注
		 * sortは重たい処理なので、2番目に大きい値を求めるだけであれば
		 * 最初のfor文で最大値を、次のfor文で最大値以外の最大値を
		 * 求めるとパフォーマンスが3倍以上に上がります。
		 */

		int max = 0;
		for(int i = 0; i < n; i++) {
			if (x[i] > max) {
				max = x[i];
			}
		}
		int secondMax = 0;
		for(int i = 0; i < n; i++) {
			if (x[i] != max && x[i] > secondMax) {
				secondMax = x[i];
			}
		}
		System.out.println(secondMax);
		long end = System.nanoTime();
		System.out.printf("処理時間: %dナノ秒%n", end - start);
		
		Arrays.sort(x);
		printArray(x);
	}

	public static int[] generateIntArray(int size, int maxInt) {
		int[] result = new int[size];
		int i = 0;
		while (i < size) {
			int rand = -1;
			Random r = new Random();
			rand = r.nextInt(maxInt) + 1;
			result[i] = rand;
			i++;
		}
		return result;
	}

	public static void printArray(int[] array) {
		for (int n: array) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
}
