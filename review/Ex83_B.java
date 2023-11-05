package review;

import java.util.Scanner;

public class Ex83_B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int result = 0;
		
		for(int i = 1; i <= n; i++) {
			int tmp = sumDigits(i);
			
			if(tmp >= a && tmp <= b) {
				result += i;
			}
		}	
		System.out.println(result);

		sc.close();
	}
	
	public static int sumDigits(int n) {
		int sumDigit = 0;
		while(n > 0) {
			sumDigit += n % 10;
			n /= 10;
		}
		return sumDigit;
	}

}
