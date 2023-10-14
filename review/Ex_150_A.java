package review;

import java.util.Scanner;

public class Ex_150_A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();//500円玉の枚数K枚
		int x = sc.nextInt();//実際の額X円
		
		int total = k * 500;
		if(total >= x) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		sc.close();
	}

}
