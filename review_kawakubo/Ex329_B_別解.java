package review_kawakubo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ex329_B_別解 {

	public static void main(String[] args) {

		int n = 500;
		int intMax = 1_000;
		int[] x = generateIntArray(n, intMax);
		

		long start = System.nanoTime();

		/*
		 * 川久保注
		 * sortするのであれば、x[n - 1]が自ずとmaxになります。
		 * したがって、max(七五三さんの変数であればk)を求める
		 * 処理が必要なくなる分、少しパフォーマンスが改善します。
		 */
		Arrays.sort(x);

		int max = x[n - 1];
		int secondMax = 0;
		for(int i = n-1; i >= 0; i--) {
			if(max > x[i]) {
				secondMax = x[i];
				break;
			}
		}
		System.out.println(secondMax);
		long end = System.nanoTime();
		System.out.printf("処理時間: %dナノ秒%n", end - start);

		printArray(x);
	}

	public static int[] generateIntArray(int size, int maxInt) {
		int[] result = new int[size];
		Set<Integer> generated = new HashSet<>();
		int i = 0;
		while (i < size) {
			int rand = -1;
			while (true) {
				Random r = new Random();
				rand = r.nextInt(maxInt) + 1;
				if (!generated.contains(rand)) {
					result[i] = rand;
					i++;
					break;
				}
			} 
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
