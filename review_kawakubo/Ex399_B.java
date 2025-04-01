package review_kawakubo;

import java.util.Scanner;

public class Ex399_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		final int RETSU = 2;
		
		//得点、ランキングを保持する2次元配列
		int[][] points = new int[n][RETSU];
		
		//ソート用の配列
		int[] sortedArray = new int[n];

		
		for (int i = 0; i < points.length; i++) {
			for(int j = 0; j < points[i].length -1; j++) {
				//1列目のみ得点を格納する
				points[i][j] = sc.nextInt();
			} 
		}
		
		//同じ参照先にしたくなく泣く泣く二度手間で入力することに。。
		System.out.println("もう一度入力してください");
		for(int i = 0; i < sortedArray.length; i++) {
			sortedArray[i] = sc.nextInt();
		}
		

		sortPoints(sortedArray);
		
		//sort前
		for (int i = 0; i < points.length; i++) {
			for(int j = 0; j < points[i].length -1; j++) {
				System.out.println(points[i][j]);
			}
		}
		
		//sort済み
		for(int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}
		
		

		//ランキング順を保持する変数
		int rankCount = 1;


		//result[]配列とpoints[][]配列で同じ得点があればpoints[][]二列目にランキングを格納しようとするも失敗
		//そもそも入力例の3,12,9,9のように同じ得点数9が２つ以上存在したとき、このやり方では元のインデックスを特定するのは難しい
		for(int i = 0; i < points.length; i++) {
			for(int j = 0; j < points[i].length -1; j++) {
				if(sortedArray[i] == points[i][j]) {
					points[i][j + 1] = rankCount;
					rankCount ++;
				}
			}
		}
		
		for (int i = 0; i < points.length; i++) {
			for(int j = 1; j < points[i].length; j++) {
				System.out.println(points[i][j]);
			}
		}
		
		sc.close();
		
	}

	//降順sort
	public static void sortPoints(int[] points) {

		for (int i = 0; i < points.length - 1; i++) {
			for (int j = i + 1; j < points.length; j++) {
				if (points[i] < points[j]) {
					int temp = points[i];
					points[i] = points[j];
					points[j] = temp;
				}
			}

		}
	}
}
