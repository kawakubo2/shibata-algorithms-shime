package review_kawakubo;

import java.util.Scanner;
import java.util.TreeSet;

public class Ex93_B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a  = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		
		/*
		 * 特に指摘することがないので、TreeSetを使って解いてみます。
		 * Setは重複を意識することなく、値を詰め込むだけでいいので、
		 * 難しい、条件分岐が必要なくなります。
		 */
		var numbers = new TreeSet<Integer>();
		for (int i = a; i < a + k && i < b; i++) {
			numbers.add(i);
		}
		for (int i = b; i > b - k && i > a; i--) {
			numbers.add(i);
		}
		for (var num : numbers) {
			System.out.println(num);
		}
		sc.close();
	}

}
