package review_kawakubo;

import java.util.Arrays;
import java.util.Scanner;

public class Ex147_A {

	//https://atcoder.jp/contests/abc147/tasks/abc147_a
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("3つの整数を入力せよ");
		/*
		 * 特に指摘するところはありません。
		 * 今回もあえてStream APIを使うとしたら
		 * 以下のようになります。
		 * (少し、強引ですかね。(;'∀'))
		 */
		int total = Arrays.stream(sc.nextLine().split(" "))
							.mapToInt(Integer::parseInt)
							.sum();

		if(total >= 22) {
			System.out.println("bust");
		}else {
			System.out.println("win");
		}
		sc.close();
	}

}
