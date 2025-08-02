package review;

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

		int total;

		for (int i = 0; i < distance.length; i++) {
			total = 0;
			total = distance[i];
			System.out.println(total);
			for (int j = i + 1; j < distance.length; j++) {
				total += distance[j];
				System.out.println(total);
			}
		}

		sc.close();

	}

}
