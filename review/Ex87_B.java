package review;

import java.util.Scanner;

public class Ex87_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int x = sc.nextInt();
		
		int ans = 0;
		
		for(int a = 0; a <= A; a++) {
			for(int b = 0; b <= B; b++) {
				for(int c = 0; c <= C; c++) {
					int d = a * 500;
					int e = b * 100;
					int g = c * 50;
					if(x - d- e- g == 0) {
						ans ++;
					}
					
				}
			}
		}
		System.out.println(ans);

		sc.close();
	}

}
