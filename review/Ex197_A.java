package review;

import java.util.Scanner;

public class Ex197_A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(s.substring(1,3)+s.charAt(0));

		sc.close();
	}

}
