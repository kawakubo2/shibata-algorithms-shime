package review_kawakubo;

import java.util.Scanner;

public class Ex144_A {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("整数を2つ半角空白で区切って入力してください: ");
		int a = scan.nextInt();
		int b = scan.nextInt();

		/*
		 !(a >= 10 || b >= 10) は結局(a < 10 && b < 10)となるので
		 else ifは不要となります。特にa <= 9 || b <= 9はaまはたbが9以下で
		 あれば計算するという意味になり。問題の趣旨とは異なります。
		 else ifは不要でelseだけで充分です。
		*/
		if(a >= 10 || b >= 10) {
			System.out.println("-1");
		// } else if (a <= 9 || b <= ) { // 本来はa <= 9 && b <= 9の時に計算となるはず
		}else {
			System.out.println(a * b);
		}
		/*
		 * であれば、正しい条件の場合、計算し、
		 * そうでなければ-1として方が問題の意図
		 * 通りなので可読性もよくなります。
		 */
		if(a <= 9 && b <= 9) {
			System.out.println(a * b);
		} else {
			System.out.println("-1");
		}
		scan.close();
	}
}
