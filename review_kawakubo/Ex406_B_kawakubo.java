package review_kawakubo;

import java.util.Scanner;

public class Ex406_B_kawakubo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		long[] array = new long[n];

		// 配列に値を格納する
		prepareArray(array, sc);

		// 配列の0番目(array[0]) * answerがkの値より大きいか判断する
		// long answer = calcFirstAnswer(array);
		long digit = calcDigit(k);
		// answer = judgeFirstNumber(array, k, digit);

		long answer = calcResult(array, digit);
		System.out.println(answer);

		sc.close();
	}

	// 配列に値を格納する
	// Aiは18桁なのでintでは桁が足りないためlongにします。
	public static void prepareArray(long[] array, Scanner sc) {

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
	}

	//// 配列の0番目(array[0]) * answerを計算する
	// public static long calcFirstAnswer(long[] array) {

	// long answer = 1 * array[0];
	// return answer;
	// }

	// 上限の桁数を計算する
	// 川久保注)
	// 整数値で18桁まで耐えられるのはlong型となります。
	// long型に変換した方が比較しやすいです。
	public static long calcDigit(int k) {

		long digit = (long) Math.pow(10, k);

		return digit;
	}

	// 初手の配列の0番目*answerがkの値より大きいか判断する 初手ですでにkの桁数を超えていたら1にanswerを代入する
	// public static long judgeFirstNumber(long[] array, int k, long digit) {

	// long answer = 1L;
	// // System.out.println("answerTest " + answer);
	// // System.out.println("digitTest " + digit);

	// if (answer > digit) {
	// answer = 1;
	// }

	// return answer;
	// }

	// 配列の1番目以降から計算していく
	public static long calcResult(long array[], long digit) {
		long answer = 1L;
		// answerを1から始めれば、iを1ではなく0で初期化することができます。
		// 電卓上で最初から1が表示させているのはすべての数は1をかけても元の数に
		// なるからだと思います。
		for (int i = 0; i < array.length; i++) {
			answer *= array[i];
			System.out.println("answer= " + answer);
			System.out.println("digit = " + digit);

			if (answer >= digit) {
				answer = 1;
				System.out.printf("%dを超えた。%n", digit);
				System.out.println("answer= " + answer);
			}

		}
		return answer;
	}
}
