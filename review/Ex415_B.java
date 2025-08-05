package review;

import java.util.Scanner;

public class Ex415_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		char[] array = str.toCharArray();
		final int NUM = 2;
		int[] result = new int[NUM];

		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '#') {
				result[count] = i;
				count++;
			}
			if (count >= 2) {
				count = 0;
				for (int j = 0; j < result.length; j++) {
					if (j != result.length - 1) {// 配列の末尾の値でなければ [値,]で表示する
						System.out.print((result[j] + 1) + ",");
					} else {
						System.out.println((result[j] + 1));
					}
				}
			}
		}
		sc.close();
	}

}
