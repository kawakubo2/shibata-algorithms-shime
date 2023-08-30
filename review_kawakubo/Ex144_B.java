package review_kawakubo;

import java.util.Scanner;

public class Ex144_B {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("整数: ");
		int N = scan.nextInt();
		/*
		 * 2重ループを抜け出したい場合はラベル付きbreak文を使用します。
		 * 識別子の文法を守っていればラベルはなんでも構いません。
		 */
		boolean canSolved = false;
		outer:
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if((i * j) == N) {
					canSolved = true;
					break outer;
					// System.exit(0);//breakだとbreakできなかった
				}
			}
		}
		if (canSolved) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		// または条件演算子を使用すると簡単になります。
		System.out.println(canSolved ? "Yes": "No");
		
	}

}
