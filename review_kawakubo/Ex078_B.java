package review_kawakubo;

import java.util.Scanner;

public class Ex078_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int ans = (x - z) / (y + z);
		System.out.println(ans);

		sc.close();
	}

}
