package review_kawakubo;

import java.util.Scanner;

public class Ex197_A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		// System.out.println(s.substring(1,3)+s.charAt(0));
		char[] chars = s.toCharArray();
		char temp = chars[0];
		for (int i = 1; i < s.length(); i++) {
			chars[i - 1] = chars[i];
		}
		chars[s.length() - 1] = temp;
		String result = new String(chars);
		System.out.println(result); 

		sc.close();
	}

}
