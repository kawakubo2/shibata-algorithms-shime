package review;

import java.util.Scanner;

public class Ex387_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		//0~9までの九九用の変数を用意する
		final int num = 10;
		
		//九九用の配列
		int[][] kuku = new int[num][num];

		//九九を生成
		generateKuku(kuku);
		
		
		int total = calcTotal(kuku);
		
		int ans = calcKukuExceptX(kuku, x, total);
		
		System.out.println(ans);

		sc.close();
	}

	//九九の全ての数の合計を計算する
	public static int calcTotal(int[][] kuku) {

		int total = 0;

		for (int i = 1; i < kuku.length; i++) {
			for (int j = 1; j < kuku.length; j++) {
				total += kuku[i][j];
			}
		}

		return total;
	}

	//九九を生成する
	public static void generateKuku(int[][] kuku){
		
		for(int i = 1; i < kuku.length; i++) {
			for(int j = 1; j < kuku.length; j++) {
				kuku[i][j] = i * j;
			}
		}
	}
	
	//x以外の九九の総和を計算する
	public static int calcKukuExceptX(int[][] kuku, int x, int total) {
		
		for (int i = 1; i < kuku.length; i++) {
			for (int j = 1; j < kuku.length;j++) {
				if (kuku[i][j] == x) {
					total -= x;
					break;
				}
			}
		}
		return total;
	}

}
