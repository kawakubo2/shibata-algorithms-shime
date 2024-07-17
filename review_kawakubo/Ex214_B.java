package review_kawakubo;

import java.util.Scanner;

public class Ex214_B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int t = sc.nextInt();
		int ans = 0;
	
		long start = System.nanoTime();
		for (int i = 0; i <= s; i++) {
			for (int j = 0; i + j <= s; j++) {
				for (int k = 0; i + j + k <= s; k++) {
					if(i * j * k > t) {
						break;
					}else {
						ans++;
					}
				}
			}
		}
		long end = System.nanoTime();
		System.out.println(ans);
		System.out.printf("処理時間=%dナノ秒%n", (end - start));
		sc.close();
	}
}
