package review;

import java.util.Scanner;

public class Ex335_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i <= n; i++) {
			for(int j = 0; j <= n - i; j++) {
				for(int k = 0; k <= n -i - j; k++) {
					System.out.println(i + " " + j + " " + k);
				}
			}
		}

		sc.close();
	}

}
