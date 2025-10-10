package review_kawakubo;

import java.util.Scanner;

public class Ex426_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		char firstChar = str.charAt(0);
		char secondChar = '\0';

		int firstCount = 1;
		int secondCount = 0;

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == firstChar) {
				firstCount++;
			} else {
				secondChar = str.charAt(i);
				secondCount++;
			}
			if (firstCount > 1 && secondChar != '\0') {
				System.out.println(secondChar);
				break;
			} else if (secondCount > 1) {
				System.out.println(firstChar);
				break;
			}
		}

		sc.close();

	}

}
