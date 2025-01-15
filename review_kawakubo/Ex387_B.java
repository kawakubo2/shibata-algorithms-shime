package review_kawakubo;

import java.util.HashMap;
import java.util.Map;
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
		
		Map<Integer, Integer> map = createSameNumberMap(kuku);
		
		System.out.println(total - map.get(x));

		System.out.println(map);

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
	
	// 九九の結果をキー、同じ結果の合計を値とするMapを生成し返す
	public static Map<Integer, Integer> createSameNumberMap(int[][] kuku) {
		Map<Integer, Integer> result = new HashMap<>();
		for (int i = 1; i <= 81; i++) {
			result.put(i, 0);
		}
		for (int i = 1; i < kuku.length; i++) {
			for (int j = 1; j < kuku.length;j++) {
				result.put(kuku[i][j], result.get(kuku[i][j]) + kuku[i][j]);
			}
		}
		return result;
	}
}
