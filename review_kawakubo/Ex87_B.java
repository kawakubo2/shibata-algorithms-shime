package review_kawakubo;

import java.util.Scanner;

public class Ex87_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int x = sc.nextInt();
		
		int ans = 0;
		
		long startTime = System.nanoTime();
		for(int a = 0; a <= A; a++) {
			int d = a * 500; // ここで1度だけ計算
			for(int b = 0; b <= B; b++) {
				int e = b * 100; // ここで1度だけ計算
				for(int c = 0; c <= C; c++) {
					// int d = a * 500; // 一番外側のfor文へ移動
					// int e = b * 100; // 一つ上のfor文へ移動
					/*
					 * 川久保
					 * なぜ、計算を移動させたか？
					 * int d = a * 500をこのループの中に行った場合と
					 * 一番外側で行った場合、入力例3の通り
					 * 入力すると 30 * 40
					 * つまり1200倍も多く計算を行ってしまいます。
					 * コンピュータの性能は向上しましたが、
					 * 単なる乗算でも回数が増えると無視できないように
					 * なってきます。
					 * 多重繰り返し分の場合、指数関数的に計算量が増えてくるので
					 * 1) 同じ結果を出す計算は一か所で
					 * 2) 目的を達したら早めに抜け出す
					 * などの対処をした方がいいと思います。
					 * 
					 * 別解メソッドを作りました。
					 * 今回はブルートフォースで解いていますので
					 * 回す順序は逆でも構いません。
					 */
					int g = c * 50;
					if(x - d - e - g == 0) {
						ans ++;
						break;
					}
					
				}
			}
		}
		long endTime = System.nanoTime();
		System.out.println(ans);
		System.out.printf("処理時間: %dナノ秒%n", endTime - startTime);

		別解(A, B, C, x);

		sc.close();
	}

	public static void 別解(int A, int B, int C, int x) {
		System.out.println("---< 別解 >---");
		int ans = 0;
		
		long startTime = System.nanoTime();
		for(int c = 0; c <= C; c++) {
			int g = c * 50;
			for(int b = 0; b <= B; b++) {
				int e = b * 100;
				for(int a = 0; a <= A; a++) {
					int d = a * 500;
					if(x - d - e - g == 0) {
						ans ++;
						break;
					}
				}
			}
		}
		long endTime = System.nanoTime();
		System.out.println(ans);
		System.out.printf("処理時間: %dナノ秒%n", endTime - startTime);

	}

}
