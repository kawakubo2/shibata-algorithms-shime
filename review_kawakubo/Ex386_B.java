package review_kawakubo;

import java.util.Scanner;

public class Ex386_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int count = getCount(str);
		System.out.println(count);

		sc.close();
	}
	

	// ボタンを押す回数
	public static int getCount(String str) {
		int i = 0;
		int count = 0;
		while (i < str.length()) {
			if (i < str.length() - 1 && str.charAt(i) == '0' && str.charAt(i + 1) == '0') {
				i += 2;
			} else {
				i++;
			}
			count++;
		}
		return count;	
	}
}