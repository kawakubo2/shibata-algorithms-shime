package review;

import java.util.Scanner;

public class Ex252_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int k = sc.nextInt();
		int max = 0;
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			if(a[i] > max) {
				max = a[i];
			}
		}
		
		for(int i = 0; i< k; i++) {
			int b = sc.nextInt();
			
			//配列は0始まり、bは1から数えているのでそのズレをa[b-1]で表現している
			if(a[b -1] == max) {
				System.out.println("Yes");
			}
		}
		System.out.println("No");
		
		sc.close();	

	}

}
