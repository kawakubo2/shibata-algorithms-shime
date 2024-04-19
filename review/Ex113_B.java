package review;

import java.util.Scanner;

public class Ex113_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		int ans = 0;
		double min = Integer.MAX_VALUE;

		for (int i = 1; i <= n; i++) {
			int height = sc.nextInt();
			double avg = t - height * 0.006;
			// 平均温度とA度の差が小さいほど値は近い 絶対値で＋ー消す
			double s = Math.abs(avg - a);

			if (s < min) {
				min = s;
				ans = i;
			}
		}
		System.out.println(ans);

		sc.close();
	}
}
