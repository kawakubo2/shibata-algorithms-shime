package review;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex405_B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] array = new int[n];
		Set<Integer> set = new HashSet<Integer>();

		count(set, array, sc, n, m);

		sc.close();
	}

	public static void count(Set<Integer> set, int[] array, Scanner sc, int n, int m) {

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
			set.add(array[i]);

			if (set.size() == m) {
				System.out.println(n - i);
				return;
			}
		}
		System.out.println(0);

	}
}
