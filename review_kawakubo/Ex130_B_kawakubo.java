package review_kawakubo;

import java.util.Scanner;

public class Ex130_B_kawakubo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int[] lArray = new int[n];
		for(int i = 0; i < lArray.length; i++) {
			lArray[i] = sc.nextInt();
		}
	
		/*
		川久保注
		Di = Di-1 + Li-1
		Diはi回はねた時のX軸上の座標になります。
		つまり、DiはLの合計値となるので、配列を
		使用せず、そのまま合計で求めることも可能です。
		*/
		/*
		int[] result = new int[n + 1];
		result[0] = 0;//最初は０スタートなのでresult[0]には０が入る
		*/
		int count = 1;

		int d = 0;
		for(int i = 1; i < lArray.length; i++) {
			// result[i] = result[i -1] + lArray[i -1];
			d += lArray[i - 1];
			if(d > x) {
				break;
			}
			count ++;
		}
		
		System.out.println(count);

		sc.close();
	}

}
