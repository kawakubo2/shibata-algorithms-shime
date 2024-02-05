package review_kawakubo;

import java.util.Scanner;

public class Ex90_B_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 0;
	
		outer:
		for(int i = a; i <= b; i++) {
			String s = Integer.toString(i);
			/*
			 * 0, 4, 1, 3などのハードコーディングを避ける方法を紹介します。 
			 * 今回5桁の数字だからこのように書けますが
			 * 123 41842
			 * など桁数が異なる場合はハードコーディングは無理があります。
			 * 今回は5桁の数字でしたが、以下のように汎用性を持たせると、
			 * 桁数に関係なく回文を探せるようになります。
			if(s.charAt(0) == s.charAt(4) && s.charAt(1) == s.charAt(3)) {
				result ++;
			}
			*/
			for (int j = 0; j < s.length() / 2; j++) {
				if (s.charAt(j) != s.charAt(s.length() - 1 - j)) {
					continue outer;
				}
			}
			result++;

		}
		System.out.println(result);

		sc.close();
	}

}
