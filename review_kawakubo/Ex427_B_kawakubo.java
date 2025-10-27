package review_kawakubo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex427_B_kawakubo {

	static Map<Integer, Integer> map = new HashMap<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(A(n));
		System.out.println(A2(n));
		sc.close();
	}

	/*
	 * このような場合、再帰関数で解くのが一般的です。
	 * A(5) = f(A(0)) + f(A(1)) + f(A(2)) + f(A(3)) + f(A(4)) ---> 16
	 * A(6) = f(A(0)) + f(A(1)) + f(A(2)) + f(A(3)) + f(A(4)) + f(A(5)) ---> 23
	 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	 * A(6) = A(5) + f(A(5))
	 * となるので、return A(n - 1) + f(A(n - 1))
	 * とすれば、すっきり解けます。
	 * 
	 * ただし、nが大きな値になると劇的に遅くなるので
	 * mapを使って、A2と同様のことをAとgetNでやってみました。
	 * パフォーマンスは改善しましたが、美しくない解き方ですね。
	 */
	private static int A2(int n) {
		if (n == 0 || n == 1)
			return 1;
		return A2(n - 1) + f(A2(n - 1));
	}

	private static int A(int n) {
		if (n == 0 || n == 1)
			return 1;
		return getN(n - 1) + f(getN(n - 1));
	}

	private static int getN(int n) {
		Integer result = map.get(n);
		if (result == null) {
			result = A(n);
			map.put(n, result);
		}
		return result;
	}

	private static int f(int n) {
		int sum = 0;
		while (n > 0) {
			sum += (n % 10);
			n /= 10;
		}
		return sum;
	}

}
