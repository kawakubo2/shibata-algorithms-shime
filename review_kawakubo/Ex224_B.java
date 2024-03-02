package review_kawakubo;

import java.util.Scanner;

public class Ex224_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		int[][] x = new int[h][w];
		
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				x[i][j] = sc.nextInt();
			}
		}
		
		String ans = "Yes";
		
		for(int i = 0; i < h -1; i++) {
			for(int j = 0; j < w -1; j++) {
				if(x[i][j] + x[i + 1][j + 1] > x[i + 1][j] + x[i][j + 1]) {
					ans = "No";
					break;
				}
			}
		}
		System.out.println(ans);

		sc.close();
		
	}

}
