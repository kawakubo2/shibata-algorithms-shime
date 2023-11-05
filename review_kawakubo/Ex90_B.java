package review_kawakubo;

import java.util.Scanner;

public class Ex90_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		
		for(int i = a; i <= b; i++) {
			int ans = getPalindromicNum(i);
			if(ans == i) {
				System.out.println(ans);
				count++;
			}
		}
		System.out.println(count);
		
		sc.close();
	}
	
	public static int getPalindromicNum(int n) {
		int result = 0;
		while (n > 0) {
			result = result * 10 + n % 10;
			n /= 10;
		}
		return result;
	}

}
