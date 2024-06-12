package review_kawakubo;

import java.util.Scanner;

public class Ex196_C {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();

		long start = System.currentTimeMillis();

		long n = Long.parseLong(str);
		
		long count = 0;
		//解説の中で今回の条件は10の12乗までとあったが、全探索すると処理時間がかなりかかるため不合格になる
		//Atcoderは基本どの問題も2秒以内に処理を終わらせることが条件　10の6乗くらいまでなら2秒以内で終わると解説内で言っていたため、100万まで探索させている　
		/*
		 * 川久保注
		 * iは最初1から始めないと1件多くなります。
		 * 0から始めると0も
		 * 0 + "" + 0 ---> 00
		 * Long.parseLong("00") ---> 0
		 * となり1件多くなってしまいます。
		 */
		for(int  i = 1; i <= 1000000;i++) {
			//文字列で一旦扱ってからlongに変換
			long num = Long.parseLong(i + "" + i);
			
			/*
			 * 川久保注
			 * num < n
			 * は最初の例の33で考えると
			 * 11, 22までは含まれますが
			 * 33 < 33がfalseとなるので
			 * カウントされません。
			 * n <= n
			 * とするとうまくいきます。
			 */
			// if (num < n) {
			/*
			 * 川久保注
			 * num > nの場合、抜け出すと劇的に速くなります。
			 * 今回、for文でi <= 1000000となっています。
			 * num は i + "" + iの値なので1000になった時点で
			 * n <= 1000000がfalseになり、残りの999000回
			 * 余分にfor文が回ってしまっています。
			 */
			if (num > n) break;
			if (num <= n) {
				count ++;
			}

		}
		
		System.out.println(count);
		System.out.println("処理時間: " + (System.currentTimeMillis() - start) + "ミリ秒");

		sc.close();
	}

}
