package review_kawakubo;

import java.util.Scanner;

public class Ex209_B_02_kawakubo {
	private static final int DISCOUNT = 1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] array = new int[n];
		/*
		 * 川久保注
		 * totalは関数の方で定義し、戻り値として返す方が
		 * 読みやすいかと思います。C言語ではポインタを渡せる
		 * のでよく見変えますが、Javaでは今から求める合計値を
		 * 引数で受け取ることはありません。
		 */
		// int total = 0;

		
		prepareArray(array, sc);
		/*
		 * 川久保注
		 * 配列を渡して戻る値がその合計値だと
		 * 読む人にとっては分かりやすくなります。
		 */
		int total = addTotal(array);
		judge(x, total);
		
		sc.close();
	}
	
	public static void prepareArray(int[] a,Scanner sc) {
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
	}
	
	// public static int addTotal(int[] a, int total) {
	// 	for(int i = 0; i < a.length; i++) {
	// 		if(i % 2 != 0) {
	// 			total += (a[i] - 1);
	// 		}else {
	// 			total += a[i];
	// 		}
	// 	}
	// 	return total;
	// }
	public static int addTotal(int[] a) {
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total += a[i];
		}
		/*
		 * 川久保注
		 * 配列の要素数が奇数の場合、0.5という端数は切り捨ててもいいので除算(/)すれば
		 * 奇数の個数が求まる
		 * また、割引額が1円は仕様変更により変わりやすいので定数化しておいたほうが
		 * いいかと思います
		 */
		return total - (a.length / 2) * DISCOUNT;
	}
	
	public static void judge(int x, int total) {
		if(x >= total) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
