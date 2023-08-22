package review_kawakubo; 

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex146_A {

	//https://atcoder.jp/contests/abc146/tasks/abc146_a
	
	public static void main(String[] args) {

		/*
		 * 日曜日の位置は0、それ以外は1以上の値を持っている。
		 * 例えば月曜日の場合、あと6日待たなければならない
		 * すなわち(7 - 1)で6日後となる。コードで書くと(days.size() - pos)
		 */
		List<String> days = Arrays.asList("SUN","MON","TUE","WED","THU","FRI","SAT");
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("今日の曜日:");
		String str = stdIn.next();
		int pos = days.indexOf(str);
		if (pos == -1) {
			System.out.println("曜日の指定に誤りがあります。");
			System.exit(1);
		}
		System.out.println("次の日曜日は" + (days.size() - pos) + "日後です。");
		

		stdIn.close();
	}
}
