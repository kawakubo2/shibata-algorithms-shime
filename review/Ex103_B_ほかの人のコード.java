package review;

import java.util.Scanner;

public class Ex103_B_ほかの人のコード {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();

		boolean flag = false;

		for (int i = 0; i < s.length(); i++) {
			if (s.equals(t)) {
				flag = true;
				break;
			} else {
				s = s.substring(1, s.length()) + s.substring(0, 1);
			}
		}
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

		sc.close();
	}
}
