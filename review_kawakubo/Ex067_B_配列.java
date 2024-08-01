package review_kawakubo;

import java.util.Arrays;
import java.util.Scanner;

public class Ex067_B_配列 {

	//自動採点システム合格
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		
		int[] array = new int[n];
		
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		Arrays.sort(array);
		
	
		int sum = 0;
		for(int i = n -k; i < n; i++) {
			sum += array[i];
		}
		
		System.out.println(sum);

		sc.close();
	}

}
