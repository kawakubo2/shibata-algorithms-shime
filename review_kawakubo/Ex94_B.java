package review_kawakubo;

import java.util.Scanner;

public class Ex94_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		
		int[] a = new int[n + 1];
		
		int L = 0;
		int R = 0;
		
		for(int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
			if(a[i] < x) {
				L++;
			}else {
				R++;
			}
		}
		System.out.println(Math.min(R, L));
		
		sc.close();

	}

}
