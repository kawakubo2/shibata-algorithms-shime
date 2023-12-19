package review_kawakubo;

import java.util.Scanner;

public class Ex95_B_別解答その1 {

	public static void main(String[] args) {
		/*
		 * 七五三さんのプログラムを細かいメソッドに分けました。
		 * 1行しかなくてもメソッド化するとメソッド名で説明できる
		 * ようになります。
		 * 
		 * 解き方のポイント
		 * (1) 必ずすべてのN種類を作らなければならないので、
		 *     まずは1個ずつN種類作る
		 *     つまり、すべての1個当たりの重量の合計を求める
		 * (2) 残った材料で個数を最大にするには、一番重量が小さい
		 *     ものを見つけ出す。
		 * (3) 残った材料を(2)で求めた材料で割った商を求める。
		 * (4) N + (3)の結果が解となる
		 */

		/*
		 * ポイント
		 * 最小のグラム数で作れるお菓子を可能な限り作りまくる 
		 */

		Scanner sc = new Scanner(System.in);
		int num = getNumber(sc);
		int amount = getAmount(sc);

		//配列を作成し値を代入していく
		int[] products = getTypesOfDoughnuts(sc, num);
		
		//最小のグラム数で作れるお菓子を求める
		int min = getMin(products);
	
		//ドーナッツの個数をカウントする
		//まず配列の要素分をtotalNumOfDonutsに代入する
		int totalNumOfDonuts = products.length;
		
		//配列の要素分消費したグラム数を求める
		int x = getTotalUsingProducts(products);

		//トータルのお菓子の材料から配列分すでに消費したグラムを引く
		amount = amount - x;
		
		//残りのグラム数で作った回数分count++する
		 /*
		 * int count = 0;		
		 * while (amount >= min) {
		 * 	amount -= min;
		 * 	count++;
		 * }
		 * ここは単純にamount / min の商を使用していいかと思います。
		 */
		int count = amount / min;
		totalNumOfDonuts += count;

		System.out.println("最終的に作れるお菓子の数:" + totalNumOfDonuts + "個");

		sc.close();
	}

	private static int getNumber(Scanner in) {
		System.out.println("種類:");
		return in.nextInt();
	}

	private static int getAmount(Scanner in) {
		System.out.println("材料のグラム数:");
		return in.nextInt();
	} 

	private static int[] getTypesOfDoughnuts(Scanner in, int num) {
		int[] products = new int[num];
		for (int i = 0; i < products.length; i++) {
			products[i] = in.nextInt();
		}
		return products;
	}

	private static int getTotalUsingProducts(int[] products) {
		int total = 0;
		for(int i = 0; i < products.length; i++) {
			total += products[i];
		}
		return total;
	}

	public static int getMin(int[] arrays) {
		int min = arrays[0];
		for (int i = 1; i < arrays.length; i++) {
			if (arrays[i] < min) {
				min = arrays[i];
			}
		}
		return min;
	}

}
