package review_kawakubo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex91_B {

	//他の人のコードをコピペしただけ
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Map<String, Integer> blue = new HashMap<String, Integer>();

		/*
		* getOrDefaultはMapにキーが存在しない場合に返す値を指定できます。
		* このメソッドがなかった頃は
		for (int i = 0; i < n; i++) {
			String ball = sc.next();
			if (blue.containsKey(ball)) {
				blue.put(ball, 0);
			}
			blue.put(ball, blue.get(ball) + 1);
		}
		のように記述しなければなりませんでした。
		if elseでもいいですが、キーが存在する場合と存在しない場合を考慮した
		記述が必要だったわけです。これは非常に面倒くさいので多くの言語が
		キーが存在しない場合のでファイル値を用意できるようになりました。
		*/

		for (int i = 0; i < n; i++) {
			String ball = sc.next();
			blue.put(ball, blue.getOrDefault(ball, 0) + 1);
		}

		int m = sc.nextInt();

		Map<String, Integer> red = new HashMap<>();
		for (int i = 0; i < m; i++) {
			String ball = sc.next();
			red.put(ball, red.getOrDefault(ball, 0) + 1);
		}

		/*
		 * いいとき方をしていると思います。
		 * とにかくblueにballが存在しないことには儲けることができないので、
		 * blueを拡張for文で回すのは賢いとき方ですね。
		 * 今回問題が求めていることは高橋君が儲ける最大値なので
		 * 最低は0にしたいところです。
		 * それが
		 * ans = Math.max(ans, countBlue - countRed);
		 * ですね。countBlue - countRedが負の値となる場合は
		 * ansには初期値0が設定されているため、Math.minに
		 * より0が返されます。
		 * 別の書き方をすれば
		 * ans = countBlue - countRed > ans ? countBlue - countRed: ans;
		 * のようになります。
		 */
		int ans = 0;
		for (String ball : blue.keySet()) {
			int countBlue = blue.get(ball);
			int countRed = red.getOrDefault(ball, 0);
			ans = Math.max(ans, countBlue - countRed);
		}

		System.out.println(ans);

		sc.close();
	}

}
