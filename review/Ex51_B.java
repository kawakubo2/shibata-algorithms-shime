package review;

import java.util.Scanner;

public class Ex51_B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int s = sc.nextInt();
		int ans = 0;
		for (int x = 0; x <= k; x++) {
			for (int y = 0; y <= k; y++) {
				if (x + y <= s && (s - x - y) <= k) {
					ans++;
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
