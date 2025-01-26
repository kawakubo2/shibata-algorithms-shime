package review;

import java.util.Scanner;

public class Ex356_B_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//N品の食品
		int n = sc.nextInt();
		
		//M 種類の栄養素
		int m = sc.nextInt();

		int[] a = new int[m];

		int[][] x = new int[n][m];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				x[i][j] = sc.nextInt();
			}
		}
		
		//各栄養素の累計を入れる配列
		int[] ans = new int[m];
		
		
		
		for(int i = 0; i < ans.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				if(j == i) {
					ans[i] += x[i][j];
				}
			}
		}
		
		for(int i = 0; i < ans.length; i++) {
			System.out.println("ans[i]= " + ans[i]);
		}

		sc.close();
		
	}

}
