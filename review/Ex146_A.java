package review; 

import java.util.Scanner;

public class Ex146_A {

	//https://atcoder.jp/contests/abc146/tasks/abc146_a
	
	public static void main(String[] args) {

		String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("今日の曜日:");
		String str = stdIn.next();
		
		switch(str) {
			case "SUN": System.out.println("次の日曜は7日後です"); break;
			case "MON": System.out.println("次の日曜は6日後です"); break;
			case "TUE": System.out.println("次の日曜は5日後です"); break;
			case "WED": System.out.println("次の日曜は4日後です"); break;
			case "THU": System.out.println("次の日曜は3日後です"); break;
			case "FRI": System.out.println("次の日曜は2日後です"); break;
			case "SAT": System.out.println("次の日曜は1日後です"); break;
		}

		stdIn.close();
	}
}
