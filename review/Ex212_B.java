package review;

import java.util.Scanner;

public class Ex212_B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int a = x / 1000;
		x %= 1000;
		int b = x / 100;
		x %= 100;
		int c = x / 10;
		x %= 10;
		int d = x;
		
		if((a == b && c == d) && a == c) {
			System.out.println("Weak");
		}else if((a + 1)% 10 == b && (b + 1)%10 == c && (c + 1) % 10  == d) {
			System.out.println("Weak");
		}else {
			System.out.println("Strong");
		}

		sc.close();
	}

}
