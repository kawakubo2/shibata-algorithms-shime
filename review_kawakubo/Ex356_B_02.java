package review_kawakubo;

import java.util.Scanner;

public class Ex356_B_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//N品の食品
		int n = sc.nextInt();
		
		//M 種類の栄養素
		int m = sc.nextInt();

		int[] a = new int[m];

		int[][] data = new int[n][m];
		
		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				data[i][j] = sc.nextInt();
			}
		}
		
		//各栄養素の累計を入れる配列
		int[] ans = new int[m];
		
		
		
		for(int x = 0; x < m; x++) {
			for(int y = 0; y < n; y++) {
				// if(j == i) {
					ans[x] += data[y][x];
				// }
			}
		}
		
		// for(int i = 0; i < m; i++) {
		// 	System.out.printf("ans[%d]=%d%n", i, ans[i]);
		// }

		boolean satisfied = true;

		for (int i = 0; i < m; i++) {
			if (ans[i] < a[i]) {
				satisfied = false;
				break;
			}
		}

		System.out.println(satisfied ? "Yes": "No");


		sc.close();
		
	}

}
