package review_kawakubo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex405_B_kawakubo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		// int[] array = new int[n];
		int[] numbers = prepare(sc, n);

		count(numbers, n, m);

		sc.close();
	}

	public static int[] prepare(Scanner sc, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}

	/*
	 * 川久保注
	 * 本来、n個の数値が与えられるわけですから、配列を作る部分はprepareメソッドと
	 * して分けたほうがいいかと思います。問題文には明記されていないので、断言できない
	 * ですが、配列は所与のもので、入力しつつ処理するものではないように思えます。
	 * また、もとのcountメソッドは引数が多すぎて、可読性が少し悪くなっています。
	 * 
	 * 引数 Set<Integer> set はメソッド内に閉じたものなので、引数として渡さず、
	 * メソッド内部で定義する。
	 * そうすることでmainメソッドで不用意にSetを操作することを防ぐことができます。
	 */
	public static void count(int[] numbers, int n, int m) {
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < n; i++) {
			set.add(numbers[i]);
			if (set.size() == m) {
				System.out.println(n - i);
				return;
			}
		}
		System.out.println(0);

	}
}
