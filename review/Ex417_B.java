package review;

import java.util.Scanner;

public class Ex417_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] a = new int[n];
		int[] b = new int[m];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}

		/*
		 * aはソート済みなので二分探索が可能
		 * binarySearchで-1より大きなindexが返ってきたら、a[index] = 0;
		 */
		for (int i = 0; i < m; i++) {
			int index = binbarySearch(a, b[i]);
			if (index > -1) {
				a[index] = 0;
			}
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				System.out.print(a[i] + " ");
			}
		}

		sc.close();
	}

	public static int binbarySearch(int[] array, int target) {
		int left = 0;
		int right = array.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (target > array[mid]) {
				left = mid + 1;
			} else if (target < array[mid]) {
				right = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}
