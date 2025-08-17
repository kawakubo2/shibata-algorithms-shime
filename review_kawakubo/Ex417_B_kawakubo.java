package review_kawakubo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex417_B_kawakubo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		// int[] a = new int[n];
		List<Integer> a = new ArrayList<>();
		int[] b = new int[m];

		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
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
				a.remove(index);
			}
		}

		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i) + " ");
		}

		sc.close();
	}

	public static int binbarySearch(List<Integer> list, int target) {
		int left = 0;
		int right = list.size() - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (target > list.get(mid)) {
				left = mid + 1;
			} else if (target < list.get(mid)) {
				right = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}
