package review_kawakubo;


import java.util.Scanner;

public class Ex292_A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		String lower = "abcdefghijklmnopqrstuvwxyz";
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		char result[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			result[i] = upper.charAt(lower.indexOf(str.charAt(i)));
		}

		System.out.println(new String(result));


		sc.close();
	}

}
