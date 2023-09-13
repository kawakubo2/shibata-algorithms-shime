package review;

import java.util.Scanner;

public class Ex144_B {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if((i * j) == N) {
					System.out.println("Yes");
					System.exit(0);//breakだとbreakできなかった
				}
			}
		}
		System.out.println("No");
		scan.close();	
	}

}
