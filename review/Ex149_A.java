package review;

import java.util.Scanner;

public class Ex149_A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.next();
		String s2 = sc.next();
		
		String str = s2.concat(s1);
		System.out.println(str);

		sc.close();
	}

}
