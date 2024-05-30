package review;

import java.util.Scanner;

public class Ex080_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int ans = calc(n);

		if (isHarshad(n, ans)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();

	}

	public static int calc(int n) {
		int ans = 0;
		while (n > 0) {
			ans += n / 10;
			n /= 10;
		}
		return ans;
	}

	public static boolean isHarshad(int n, int ans) {

		if (n % ans == 0) {
			return true;
		} else {
			return false;
		}

	}
}
