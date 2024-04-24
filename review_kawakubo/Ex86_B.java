package review_kawakubo;

import java.util.Scanner;

public class Ex86_B {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		/*
		 * 川久保
		 * 制約を見ると、
		 * 1 <= a, b <= 100
		 * a,bは整数
		 * と書いてあるので、最大でも6桁で
		 * 整数 + 整数 の結果も整数であるので
		 * int型へ変換可能。
		 * Mathクラスが使用できないとすると
		 * targetが平方数であるかを調べるメソッドが
		 * 必要となる。
		 * 
		 * 1 <= n <= Integer.parseInt(a + b);
		 * 2分探索と同じ要領で、探索可能。
		 * isSquareメソッドを作ったので
		 * 少ない検索で平方数であるかを
		 * 調べることが可能です。
		 */
		int target = Integer.parseInt(a + b);
		System.out.println("a + b = " + target);
		
		System.out.println(isSquare(target) ? "Yes": "No");	

		sc.close();
	}
	
	public static boolean isSquare(int num) {
		int left = 0;
		int right = num;
		int mid;
		int count = 0; // デバッグ用変数
		while (left <= right) {
			count++;
			mid = (left + right) / 2;
			if (mid * mid > num) {
				right = mid - 1;
			} else if (mid * mid < num) {
				left = mid + 1;
			} else {
				System.out.println("検索にかかった回数=" + count);
				return true;
			}
		}
		System.out.println("検索にかかった回数=" + count);
		return false;
	}

}
