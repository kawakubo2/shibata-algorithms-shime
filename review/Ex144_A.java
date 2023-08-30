package review;

import java.util.Scanner;

public class Ex144_A {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
	
		if(a >= 10 || b >= 10) {
			System.out.println("-1");
		}else if(a <= 9 || b <= 9) {
			System.out.println(a * b);
		}
		scan.close();
	}
}
