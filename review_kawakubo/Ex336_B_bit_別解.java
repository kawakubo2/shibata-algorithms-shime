package review_kawakubo;

import java.util.Scanner;

public class Ex336_B_bit_別解 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(countZeros(n));
		
		sc.close();
	}
	
	public static int countZeros(int n) {
		int count = 0;
		int mask = 1;
		/*
		 * maskは最下位ビットだけが1となっています。
		 * つまり、
		 * ビット積の結果が1であればnの最下位ビットが1、
		 *                0であればnの最下位ビットが0
		 * と分かります。
		 */
		while ((n & mask) == 0) {
			n >>= 1;
			count++;
		}
		return count;
	}
}
