package review_kawakubo;

import java.util.Scanner;

public class Ex077_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long shimeStart1 = System.currentTimeMillis();
		long ans = 0;
		for(long i = n; i > 0;i--) {
			if(i * i <= n) {
				ans  = i * i;
				break;
			}
		}
		System.out.println(ans);
		System.out.println("七五三1処理時間: " + (System.currentTimeMillis() - shimeStart1) + "ミリ秒");

		long shimeStart2 = System.currentTimeMillis();
		// for(int i = 0; i <= n; i++) {
		for(long i = 0; i <= n; i++) {
			if(i * i <= n) {
				ans = i * i;
			//	System.out.println("i=" + i);
			//	System.out.println("ans=" + ans);
			}
		}
		System.out.println(ans);
		System.out.println("七五三2処理時間: " + (System.currentTimeMillis() - shimeStart2) + "ミリ秒");


		long kawakuboStart = System.currentTimeMillis();
		long start = System.nanoTime();
		long maxSquare = 0;
		/*
		川久保注
		二分探索と同じ要領ですね。
		*/	
		long left = 0;
		long right = n;
		while (left <= right) {
			long mid = (left + right) / 2;
			long square = mid * mid;
			if (square > n) right = mid - 1;
			if (square <= n) {
				left = mid + 1;
				maxSquare = square;
			}
		}
		System.out.println(maxSquare);
		System.out.println("川久保処理時間: " + (System.currentTimeMillis() - kawakuboStart) + "ミリ秒");
		System.out.println("川久保処理時間: " + (System.nanoTime() - start) + "ナノ秒");
		sc.close();
	}
}