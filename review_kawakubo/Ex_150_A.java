package review_kawakubo;

import java.util.Scanner;

public class Ex_150_A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();//500円玉の枚数K枚
		int x = sc.nextInt();//実際の額X円
		
		/*
		 * 特に指摘することはありません。
		 */
		int total = k * 500;
		if(total >= x) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		/*
		 * あえて別の解き方をすれば以下のようになりますが、
		 * 可読性という面からすれば、あまりいいとき方とは
		 * 言えません。total = k * 500と書くことで
		 * k * 500が合計をもとめることだと理解できるからです。
		 * totalのような変数を説明変数と呼びますが、可読性
		 * を上げるには必要となります。
		 * 1行と書けるというメリットはありますが。
		 */
		System.out.println(k * 500 >= x ? "Yes": "No");
		
		sc.close();
	}

}
