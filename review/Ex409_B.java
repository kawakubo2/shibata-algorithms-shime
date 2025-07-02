package review;

import java.util.Scanner;

public class Ex409_B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = prepareArray(n, sc);

		int ans = calcTotal(array, n);

		showAnswer(ans);

		sc.close();
	}

	public static int[] prepareArray(int n, Scanner sc) {

		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		return array;
	}

	public static int calcTotal(int[] array, int n) {

		int ans = 0;

		for (int i = 0; i < 101; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (array[j] >= i) {
					count += 1;
				}
			}

			if (i <= count) {
				ans = i;
			}
		}
		return ans;
	}

	public static void showAnswer(int ans) {

		System.out.println(ans);
	}
}
