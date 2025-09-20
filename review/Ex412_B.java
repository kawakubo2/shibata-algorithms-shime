package review;

import java.util.Scanner;

public class Ex412_B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		boolean ans = true;

		for (int i = 1; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				if (!t.contains(String.valueOf(s.charAt(i - 1)))) {
					ans = false;
					break;
				}
			}
		}

		System.out.println(ans ? "Yes" : "No");

		sc.close();
	}

}
