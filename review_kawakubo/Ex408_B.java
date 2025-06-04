package review_kawakubo;

import java.util.Scanner;

public class Ex408_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] array = prepare(n, sc);

		int[] flags = setFlag(array);

		showResult(flags);

		sc.close();
	}

	// 配列とSetに同時に値を格納する
	public static int[] prepare(int size, Scanner sc) {
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		return array;
	}

	public static int[] setFlag(int[] array) {
		/*
		 * 制約条件にAiは1～100におさまる数なので
		 * 101個の要素を持つ配列を用意します。
		 * 0番目は未使用です。
		 */
		int[] temp = new int[101];
		// すべての要素を0で初期化します。
		for (int i = 0; i <= 100; i++) {
			temp[i] = 0;
		}
		// その数に相当するindexの位置に1を設定します。
		for (int n : array) {
			temp[n] = 1;
		}
		return temp;
	}

	// 結果を表示する
	public static void showResult(int[] array) {

		// 0は未使用なので1から調べます。
		for (int i = 1; i <= 100; i++) {
			// array[i]に1が設定されていたらその数は
			// 存在することになります。
			if (array[i] == 1) {
				// indexがその数になるのでそのまま表示します。
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

}
