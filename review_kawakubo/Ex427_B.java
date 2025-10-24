package review_kawakubo;

import java.util.Scanner;

public class Ex427_B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 1;
		for (int i = 1; i < n; i++) {
			System.out.println("sum= " + sum);
			sum += digit(sum);
		}
		System.out.println(sum);
		sc.close();
	}

	private static int digit(int n) {
		int sum = 0;
		while (n != 0) {
			sum += (n % 10);
			n /= 10;
		}
		return sum;
	}

}
