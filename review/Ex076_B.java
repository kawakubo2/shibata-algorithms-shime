package review;

import java.util.Scanner;

public class Ex076_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int sum = 1;
		for(int i = 0; i < n; i++) {
		
			if((sum * 2) <= (sum + k)) {
				sum = sum * 2;
			}else {
				sum = sum + k;
			}
		}
		
		System.out.println(sum);

		sc.close();
		
	}

}
