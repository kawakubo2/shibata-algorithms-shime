package review;

import java.util.Scanner;

public class Ex072_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String ans = null;
		for(int i = 0; i < str.length(); i +=2) {
			ans += str.charAt(i);
		}
		System.out.println(ans);

		sc.close();
	}

}
