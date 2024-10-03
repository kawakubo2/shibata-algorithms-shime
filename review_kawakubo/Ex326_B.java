package review_kawakubo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex326_B {

	static final int MAX = 919;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var listShime = new ArrayList<Integer>();
		var listKawakubo = new ArrayList<Integer>();

		// 七五三さん方式
		long startShime = System.nanoTime();
		for (int i = 100; i <= MAX; i++) {
			listShime.add(shime326number(i));
		}
		long endShime = System.nanoTime();
		System.out.println("処理時間: " + (endShime - startShime) + "ナノ秒");

		// 川久保方式
		long startKawakubo = System.nanoTime();
		for (int i = 100; i <= MAX; i++) {
			listKawakubo.add(kawakubo326number(i));
		}
		long endKawakubo = System.nanoTime();
		System.out.println("処理時間: " + (endKawakubo - startKawakubo) + "ナノ秒");

		System.out.println(check(listShime, listKawakubo) ? "〇": "×");
		// printList(listShime, listKawakubo);

		sc.close();
	}

	public static int shime326number(int n) {
		for (int i = n; i <= MAX; i++) {
			int a = i / 100;
			int b = (i / 10) % 10;
			int c = i % 10;

			if ((a * b) == c) {
				return i;
			}
		}
		throw new IllegalArgumentException();
	}

	public static int kawakubo326number(int n) {
		int i = n;
		while(i <= MAX) {
			int a = i / 100;
			int b = (i / 10) % 10;
			int c = i % 10;

			if (a * b >= 10 && b > a) {
				i = (a + 1) * 100;
				continue;
			}
			if (a * b >= 10) {
				i = a * 100 + (b + 1) * 10;
				continue;
			}
			if ((a * b) == c) {
				return i;
			}
			i++;
		}
		throw new IllegalArgumentException();
	}

	public static void printList(List<Integer> shime, List<Integer> kawakubo) {
		for (int i = 0; i < MAX - 100; i++) {
			System.out.printf("i=%d, %d, %d %s%n", i, shime.get(i), kawakubo.get(i), (shime.get(i)).equals(kawakubo.get(i)) ? "〇": "×");
		}
		System.out.println();
	}

	public static boolean check(List<Integer> shime, List<Integer> kawakubo) {
		for (int i = 0; i < MAX - 100; i++) {
			if (!shime.get(i).equals(kawakubo.get(i))) {
				System.out.printf("i=%d, shime=%d, kawakubo=%d%n", i, shime.get(i), kawakubo.get(i));
				return false;
			}
		}
		return true;
	}
}
