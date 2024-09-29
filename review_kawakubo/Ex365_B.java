package review_kawakubo;

import java.util.Scanner;

public class Ex365_B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++) {
		  array[i] = sc.nextInt();
		}
	

		/*
		 * 川久保注
		 * 最大値とそのインデクスを求める
		 */
		int maxIndex = 0;
		int max = array[0];
		for (int i = 1; i < n; i++) {
			if (array[i] > max) {
				maxIndex = i;
				max = array[i];
			}
		}
		/*
		 * 川久保注
		 * 最大値のindexを除いての最大値とそのインデクスを
		 * 求める
		 */
		max = 0;
		int max2Index = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] > max && i != maxIndex) {
				max2Index = i;
				max = array[i];
			}
		}
		System.out.println(max2Index);

		sc.close();
	}

}
