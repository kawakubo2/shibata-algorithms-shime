package review;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ex408_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] array = new int[n];
		Set<Integer> set = new TreeSet<Integer>();

		prepare(array, set, sc);
		showResult(set);

		sc.close();
	}

	// 配列とSetに同時に値を格納する
	public static void prepare(int[] array, Set<Integer> set, Scanner sc) {

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			set.add(array[i]);
		}

	}

	// 結果を表示する
	public static void showResult(Set<Integer> set) {

		System.out.println(set.size());
		for (Integer num : set) {
			System.out.println(num);
		}
	}

}
