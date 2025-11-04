package review;

import java.util.Scanner;

public class Ex429_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] array = new int[n];
		int total = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			total += array[i];
		}

		sc.close();

		for (int i = 0; i < array.length; i++) {
			if (total - array[i] == m) {
				System.out.println("Yes");
				return;
			}
		}

		System.out.println("No");

	}

}
