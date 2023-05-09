package chapter03;

import java.util.Scanner;

public class 演習3_2 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数:");
		int num = stdIn.nextInt();
		int[] x = new int[num + 1];

		for (int i = 0; i < x.length - 1; i++) {
			System.out.print("array[" + i + "]=");
			x[i] = stdIn.nextInt();
		}

		System.out.print("探す値:");
		int key = stdIn.nextInt();
		
		printHeader(x.length);
		int result = seqSearchSen(x, num, key);
		printProcess(x, result); 
		printResult(result);
		stdIn.close();
	}
	public static int seqSearchSen(int[] a, int num, int key) {
		int i;
		a[num] = key;//番兵を追加
		
		for(i = 0; i < num; i++) {
			if(a[i] == key) {
				break;
			}
		}		
		return i == num ? -1 : i;
	}
	public static void printHeader(int size) {
		System.out.print("   |");
		for (int i = 0; i < size - 1; i++) {
			System.out.printf("%4d", i);
		}
		System.out.println();
		System.out.print("---+");
		for (int i = 0; i < size - 1; i++) {
			System.out.print("----");
		}
		System.out.println();
	}
	public static void printProcess(int[] a, int target) {
		int size = target > -1 ? target + 1 : a.length - 1;
		for (int i = 0; i < size; i++) {
			System.out.print("   |");
			for (int j = 0; j < a.length - 1; j++) {
				if (i == j) {
					System.out.print("   *");
				} else {
					System.out.print("    ");
				}
			}
			System.out.println();
			System.out.printf("%3d|", i);
			for (int j = 0; j < a.length - 1; j++) {
				System.out.printf("%4d", a[j]);
			}
			System.out.println();
		}
	}
	public static void printResult(int pos) {
		if(pos == -1) {
			System.out.println("検索した値は存在しません");
		}else {
			System.out.println("検索した値はarray[" + pos + "]です");
		}
		
	}
}