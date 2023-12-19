package review;

import java.util.Scanner;

public class Ex95_B {

	public static void main(String[] args) {

		/*
		 * ポイント
		 * 最小のグラム数で作れるお菓子を可能な限り作りまくる 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("種類:");
		int num = sc.nextInt();
		System.out.println("材料のグラム数:");
		int amount = sc.nextInt();

		//配列を作成し値を代入していく
		int[] products = new int[num];
		for (int i = 0; i < products.length; i++) {
			products[i] = sc.nextInt();
		}
		
		//最小のグラム数で作れるお菓子を求める
		int min = getMin(products);
	
		//ドーナッツの個数をカウントする
		//まず配列の要素分をtotalNumOfDonutsに代入する
		int totalNumOfDonuts = products.length;
		
		//配列の要素分消費したグラム数を求める
		int x = 0;
		for(int i = 0; i < products.length; i++) {
			x += products[i];
		}

		//トータルのお菓子の材料から配列分すでに消費したグラムを引く
		amount = amount - x;
		
		//残りのグラム数で作った回数分count++する
		int count = 0;		
		while (amount > min) {
			amount -= min;
			count++;
		}
	
		totalNumOfDonuts += count;

		System.out.println("最終的に作れるお菓子の数:" + totalNumOfDonuts + "個");

		sc.close();
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
