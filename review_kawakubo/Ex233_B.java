package review_kawakubo;

import java.util.Scanner;

public class Ex233_B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l;
		int r;
		String s;
		l = sc.nextInt() - 1;
		r = sc.nextInt() - 1;
		s = sc.next();
		
		System.out.println(reverseSubstring(s, l, r));

		sc.close();
	}

	public static String reverseSubstring(String s, int l, int r) {
		StringBuffer sb = new StringBuffer();
		String before = s.substring(0, l);
		String after = s.substring(r + 1);
		
		// 文字列の反転
		String tmp = s.substring(l,  r + 1);
		char[] chars = tmp.toCharArray();
		for (int i = 0; i < chars.length / 2; i++) {
			char c = chars[chars.length - i - 1];
			chars[chars.length - i - 1] = chars[i];
			chars[i] = c;
		}
		String reversed = new String(chars);

		sb.append(before)
		  .append(reversed)
		  .append(after);
		
		return sb.toString();
	}
}
