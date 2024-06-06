package review;

import java.util.Scanner;

public class Ex077_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int ans = 0;
		
		/**
		 * この書き方だとoverflowしたのでやめた
		 * 
		 * for(int i = n; i > 0;i--) {
			if(i * i <= n) {
				ans  = i * i;
				break;
			}
			
		}
		 * 
		 * 
		 */
		
		for(int i = 0; i <= n; i++) {
			if(i * i <= n) {
				ans = i * i;
				System.out.println("i=" + i);
				System.out.println("ans=" + ans);
			}
		}
		
		System.out.println(ans);

		sc.close();
	}

}
