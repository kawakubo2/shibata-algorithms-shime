package review_kawakubo;

import java.util.Scanner;

public class Ex080_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int ans = calc(n);

		/*
		 * 川久保注
		 * 簡単なif elseであれば条件演算子という手もあります。
		 */
		// if (isHarshad(n, ans)) {
		// 	System.out.println("Yes");
		// } else {
		// 	System.out.println("No");
		// }
		System.out.println(isHarshad(n, ans) ? "Yes": "No");

		sc.close();

	}

	public static int calc(int n) {
		int ans = 0;
		while (n > 0) {
			/*
			 * 川久保注
			 * 
			 * ans += n / 10
			 * の部分は除算ではなく剰余を使います。
			 * 例えば123の場合、
			 * 1-0) 123 / 10 ---> 12 
			 * 1-1) ans += 12 ---> 12
			 * 2-0) 12 / 10 ---> 1
			 * 2-0) ans += 1 ---> 13
			 * 3-0) 1 / 10 ---> 0
			 * 3-1) ans += 0 ---> 13
			 * 終了
			 * 
			 * 本来、6が欲しいところですが13になってしまいます。
			 * 
			 * 剰余を使用した場合
			 * 1-0) 123 % 10 ---> 3
			 * 1-1) ans += 3 ---> 3
			 * 2-0) 12 % 10 ---> 2
			 * 2-0) ans += 2 ---> 5
			 * 3-0) 1 % 10 ---> 1
			 * 3-1) ans += 1 ---> 6
			 * 終了
			 * と意図した通りの値となります。
			 * 
			 */
			// ans += n / 10;
			ans += n % 10;
			n /= 10;
		}
		return ans;
	}

	public static boolean isHarshad(int n, int ans) {
		// 川久保注
		// 等価演算子自体がboolean型なので、そのまま返せばスッキリします
		// if (n % ans == 0) {
		// 	return true;
		// } else {
		// 	return false;
		// }
		return n % ans == 0;

	}
}
