package review_kawakubo;

import java.util.Scanner;

public class Ex252_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int k = sc.nextInt();
		int[] b = new int[k];
		int max = 0;
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			if(a[i] > max) {
				max = a[i];
			}
		}
		
		for(int i = 0; i< k; i++) {
			b[i] = sc.nextInt();
		}
		
		System.out.println(judge(a, b, max) ? "Yes": "No");

		sc.close();	

	}

	public static boolean judge(int[] a, int[] b, int max) {
		for(int i = 0; i < b.length; i++) {
			if(a[b[i] - 1] == max) {
				return true;
			}
		}
		return false;
	}
}
