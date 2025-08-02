package review_kawakubo;

import java.util.Scanner;

public class Ex411_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// 各駅の距離間なので駅の数-1
		int[] distance = new int[n - 1];

		for (int i = 0; i < distance.length; i++) {
			distance[i] = sc.nextInt();
		}

		// for文の内部だけで使用するのであれば、ここでの宣言は不要
		// int total;

		for (int i = 0; i < distance.length; i++) {
			// すぐにdistane[i]で代入しなおすので不要
			// total = 0;
			int total = distance[i];
			System.out.printf("%d ", total);
			for (int j = i + 1; j < distance.length; j++) {
				total += distance[j];
				// System.out.println(total);
				System.out.printf("%d ", total);
			}
			System.out.println();
		}

		sc.close();

	}

}
