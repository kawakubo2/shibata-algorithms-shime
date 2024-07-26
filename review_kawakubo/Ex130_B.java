package review_kawakubo;

import java.util.Scanner;

public class Ex130_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int[] lArray = new int[n];
		for(int i = 0; i < lArray.length; i++) {
			lArray[i] = sc.nextInt();
		}
		
		int[] result = new int[n + 1];
		result[0] = 0;//最初は０スタートなのでresult[0]には０が入る
		int count = 1;
		
		for(int i = 1; i < result.length; i++) {
			result[i] = result[i -1] + lArray[i -1];
			if(result[i] > x) {
				break;
			}
			count ++;
		}
		
		System.out.println(count);

		sc.close();
	}

}
