package review_kawakubo;

import java.util.Scanner;

public class Ex415_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		boolean first = true;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '#') {
				if (first) {
					System.out.printf("%d,", i + 1);
				} else {
					System.out.println(i + 1);
				}
				first = !first;
			}
		}

		sc.close();
	}

}
