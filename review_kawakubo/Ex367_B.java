package review_kawakubo;

import java.util.Scanner;

public class Ex367_B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		
		StringBuffer sb = new StringBuffer(String.valueOf(x));
		int last = -1;
		while (true) {
			last = sb.length() - 1;
			if (sb.charAt(last) != '0') break;
			sb.delete(last, last + 1);
		}
		if (sb.charAt(last) == '.') {
			sb.delete(last, last + 1);
		}
		
		System.out.println(sb.toString());

		sc.close();

	}

}
