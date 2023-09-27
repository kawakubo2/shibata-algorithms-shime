package review;

import java.util.Scanner;

public class Ex148_A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(6 - (A + B) );// 1 + 2 + 3 = 6 なので差分を表示する
		
		sc.close();
	}

}
