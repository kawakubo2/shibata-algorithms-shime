package review;

import java.util.Scanner;

public class Ex406_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] array = new int[n];

		// 配列に値を格納する
		prepareArray(array, sc);

		// 配列の0番目(array[0]) * answerがkの値より大きいか判断する
		int answer = calcFirstAnswer(array);
		double digit = calcDigit(k);
		answer = judgeFirstNumber(array, k, digit);

		calcResult(answer, array, digit);

		sc.close();
	}

	// 配列に値を格納する
	public static void prepareArray(int[] array, Scanner sc) {

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
	}

	//// 配列の0番目(array[0]) * answerを計算する
	public static int calcFirstAnswer(int[] array) {

		int answer = 1 * array[0];
		return answer;
	}

	// 上限の桁数を計算する
	public static double calcDigit(int k) {

		double digit = Math.pow(10, k);

		return digit;
	}

	// 初手の配列の0番目*answerがkの値より大きいか判断する 初手ですでにkの桁数を超えていたら1にanswerを代入する
	public static int judgeFirstNumber(int[] array, int k, double digit) {

		int answer = calcFirstAnswer(array);
		// System.out.println("answerTest " + answer);
		// System.out.println("digitTest " + digit);

		if (answer > digit) {
			answer = 1;
		}

		return answer;
	}

	// 配列の1番目以降から計算していく
	public static void calcResult(int answer, int array[], double digit) {

		for (int i = 1; i < array.length; i++) {
			answer *= array[i];
			System.out.println("answer= " + answer);
			System.out.println("digit= " + digit);

			if (answer >= digit) {
				answer = 1;
			}

		}
		System.out.println(answer);

	}
}
