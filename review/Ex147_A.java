package review;

import java.util.Scanner;

public class Ex147_A {

	//https://atcoder.jp/contests/abc147/tasks/abc147_a
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("3つの整数を入力せよ");
		int num01 = sc.nextInt();
		int num02 = sc.nextInt();
		int num03 = sc.nextInt();
		
		if(num01 + num02 + num03 >= 22) {
			System.out.println("bust");
		}else {
			System.out.println("win");
		}
		sc.close();
	}

}
