package review_kawakubo;

import java.util.Scanner;

public class Ex94_B_川久保 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		
		/*
		 * 川久保注
		 * ここはマス目の数ではなく料金所のかずなので
		 * n + 1の要素数ではなくmの要素数分作る
		 * 料金所の数がマス目の数を超えてしまっている。
		 */
		// int[] a = new int[n + 1];
		int[] a = new int[m];
		
		for(int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println(calcMinPath(m, a, x));
		
		sc.close();
	}

	public static int calcMinPath(int m, int[] a, int x) {
		/*
		 * 川久保注
		 * 2分探索するが決してxは見つかることはない。
		 * なぜなら、xは料金所ではないという制約があるから。
		 * つまり見つかったindexにある値はxより大きいこと
		 * 小さいこともありうる。
		 * その調整をしているのが
		 * 
		 * int leftCount = x > a[searchIndex] ? searchIndex + 1: searchIndex;
		 * 
		 * indexは0始まりなので、xが見つかったindexの値よりも大きい場合はindex+1、
		 * xが見つかったindexの値より小さい場合、indexが左側にある料金所の
		 * 数となる。
		 * 
		 * 料金所の数はm - leftCountなので、最小値がleftCountとm - leftCount
		 * の最小値が一番コストがかからないことになる。
		 * 
		 * return Math.min(leftCount, m - leftCount);
		 * 
		 */
		int searchIndex = binarySearch(a, x);
		int leftCount = x > a[searchIndex] ? searchIndex + 1: searchIndex;

		return Math.min(leftCount, m - leftCount);
	}

	/*
	 * 川久保
	 * 長いマス目に耐えきれるように2分探索で解きました。
	 * 100程度あれば線形探索でもいいかと思います
	 * 
	 * ここで、料金所の数がmではなくnが渡されていることに
	 * 気づかず時間をとってしまいました。
	 * 結局nは使用しないままになりましたね。
	 */
	public static int binarySearch(int[] a, int x) {
		int left  = 0;
		int right = a.length - 1;
		int mid = -1;
		while (left <= right) {
			mid = (left + right) / 2;
			if (x > a[mid]) {
				left = mid + 1;
			} else if (x < a[mid]) {
				right = mid - 1;
			} else {
				throw new IllegalStateException("いる場所が料金所");
			}
		}
		return mid;
	}

}
