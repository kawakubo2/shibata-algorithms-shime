package review_kawakubo;

import java.util.Scanner;

public class Ex152_A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		/*
		 * この問題は特に指摘することはありません。
		 * 1つだけあえてあげるならば、制約でM <= N
		 * となっているので、M >= Nとするよりも
		 * M == Nとした方が問題に沿った解答になるかと
		 * 思います。
		 */
		String result = M >= N ? "Yes" : "No";
		System.out.println(result);

		sc.close();
	}

}
