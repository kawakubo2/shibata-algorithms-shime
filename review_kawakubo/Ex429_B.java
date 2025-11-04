package review;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ex429_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] array = new int[n];
		int total = 0;

		/*
		 * 今回は、全要素の中から1個の要素を取り除くことしかできないので
		 * MapではなくSetを用意しておくと楽ですね。
		 */
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			total += array[i];
			set.add(array[i]);
		}

		sc.close();

		/*
		 * for (int i = 0; i < array.length; i++) {
		 * if (total - array[i] == m) {
		 * System.out.println("Yes");
		 * return;
		 * }
		 * }
		 * System.out.println("No");
		 */

		/*
		 * total - m が整数列に含まれているかを調べるためのSetを使用します
		 * set.contains(total - m) であれば1個取り除くことでmにすることが
		 * できるので"Yes"、そうでなければ"No"を表示します
		 */
		System.out.println(set.contains(total - m) ? "Yes" : "No");
	}

}
