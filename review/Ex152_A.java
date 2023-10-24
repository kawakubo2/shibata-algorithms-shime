package review;

import java.util.Scanner;

public class Ex152_A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		String result = M >= N ? "Yes" : "No";
		System.out.println(result);

		sc.close();
	}

}
