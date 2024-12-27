package review_kawakubo;

import java.util.Scanner;

public class Ex379_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		
		
		//イチゴの個数を表示する
		displayStrawberries(calcStrawberries(s, n, k));

		sc.close();

	}
	
	//イチゴの個数を計算する
	public static int calcStrawberries(String s, int n, int k) {
		
		//丈夫な歯をカウントする
		int count = 0;
		
		//いちごの数をカウントする
		int strawberries = 0;
		
		for(int i = 0 ; i < n; i++) {
			if(s.charAt(i) == 'X') {
				count = 0;
				continue;
			} 

			count ++;
			if(count == k) {
				strawberries ++;
				count = 0;
			}
		}	
		
		return strawberries;
		
	} 
	
	public static void displayStrawberries(int strawberries) {
		System.out.println(strawberries);
	}

}
