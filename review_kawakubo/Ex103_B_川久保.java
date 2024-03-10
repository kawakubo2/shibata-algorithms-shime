package review_kawakubo;

import java.util.Scanner;

public class Ex103_B_川久保{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		
		sc.close();
		/*
		 * 川久保 
		 * 文字列が1周+1したら一致しなかったとみなしていいかと
		 * 思います。1周だけだと最後に一致する可能性があるためです。
		 */
		int i = 0;
		// for(; i < s.length(); i++) {
		for(; i <= s.length(); i++) { // 1回余分に回す
			if(s.equals(t)) {
				System.out.println("Yes");
				break;
			}
			s = rotate(s);
		}
		// 川久保
		// 増減式でさらに1加算する理由は、iはfor分を抜ける前にインクリメントされるため
		if (i == s.length() + 1) System.out.println("No");

	}
	
	public static String rotate(String s) {
		return s.substring(1,s.length()) + s.substring(0,1);
	}

}
