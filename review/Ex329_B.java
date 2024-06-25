package review;

import java.util.Arrays;
import java.util.Scanner;

public class Ex329_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 0;
		int[] x = new int[n];
		
		sc.close();

		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			k = Math.max(k, x[i]);
		}
		Arrays.sort(x);
		for(int i = n-1; i >= 0; i--) {
			if(k >x[i]) {
				System.out.println(x[i]);
				return;
			}
		}
		
	}

}
