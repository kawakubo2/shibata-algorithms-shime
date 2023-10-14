package review_kawakubo;

import java.util.Scanner;

public class Ex_150_B {

	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		
		int count = 0;
		for(int i = 0; i < n - 2; i++) {
			if(str.substring(i,i + 3).equals("ABC")) {
				count ++;
			}
		}
		System.out.println(count);

		sc.close();
	}

}
