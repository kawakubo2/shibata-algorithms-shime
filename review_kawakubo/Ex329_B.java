package review_kawakubo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ex329_B {

	public static void main(String[] args) {

		int n = 500;
		int intMax = 1_000;
		int max = 0;
		int secondMax = 0;
		int[] x = generateIntArray(n, intMax);
		

		long start = System.nanoTime();

		for(int i = 0; i < n; i++) {
			max = Math.max(max, x[i]);
		}

		Arrays.sort(x);
		

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
