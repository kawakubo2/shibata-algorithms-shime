package review_kawakubo;

import java.util.Scanner;

public class Ex113_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		int ans = 0;
		/*
		 * 川久保
		 * 最小値を求めるときはMAX_VALUE
		 * 最大値を求まるときはMIN_VALUE
		 * を初期値として設定しておくのは
		 * いいことですね。
		 * 
		 * 例えば月の平均気温を保持した以下のような配列が
		 * あるとき
		 * int avg = {-34, -40, -30, -20, -18, -10, -5, -2, -9, -22, -28, -30}
		 * 0度を超える平均気温の最大値maxを求めるとします。
		 * 
		 * この場合、参考書等ではとりあえず最初の要素(avg[0])をmaxに設定しています。
		 * そうすると、0度を超える平均気温がないため、最大値は-34℃となってしまい
		 * 間違えた回答となります。
		 * 
		 * こういう場合は、Integer.MIN_VALUEをmax設定しておき、繰返し構文を
		 * 抜けた後も、MIN_VALUEであれば「該当データなし」などのメッセージや
		 * 例外を投げるなどの対処をします。
		 * 
		 * 今回は気温の話なので、1000くらいをminに入れておけば大丈夫なのですが、
		 * これを配列やリストなどを引数として受け取るようなメソッドにした場合、
		 * 汎用性を持たせるにはInteger.MAX_VALUEを設定しておくのが無難です。
		 * (問題によってはInteger.MAX_VALUEでは足りないかもしれませんが)
		 * 
		 * 
		 */
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
