package review_kawakubo;

import java.util.Scanner;

public class Ex363_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int t = sc.nextInt();
		int p = sc.nextInt();

		int[] hairArray = new int[n];

		prepareArray(hairArray, n, sc);
		System.out.println(howManyDays(hairArray, t, p));

		sc.close();

	}

	public static void prepareArray(int[] hairArray, int n, Scanner sc) {
		for (int i = 0; i < n; i++) {
			hairArray[i] = sc.nextInt();
		}
	}

	/*
	 * 以下のように細かくメソッドを分けるとコードを書いた人以外に
	 * 説明できるような気がします。
	 * (1) t cm以上の人数(calcHair)がp人以上か判定
	 * (2) p人以上であれば、それに要した日数(days)を返す
	 * (3) そうでなければ日数(days)を1増やし、各人の髪の長さを1cm伸ばす(growHaire)
	 */
	public static int howManyDays(int[] hairArray, int t, int p) {
		int days = 0;
		while(true) {
			if (calcHair(hairArray, t) >= p) { // (1)
				return days; // (2)
			}
			days++;                // (3)
			growHair(hairArray);   //
		}
	}

	/*
	 * 髪を1cm伸ばす
	 */
	public static void growHair(int[] hairArray) {
		for (int i = 0; i < hairArray.length; i++) {
			hairArray[i]++;
		}
	}

	/*
	 * tセンチ以上の人数を計算
	 */
	public static int calcHair(int[] hairArray, int t) {
		int count = 0;
		for(int j = 0; j < hairArray.length; j++) {
			if(hairArray[j] >= t) {
				count ++;
			}
		}
		return count;
	}
}
