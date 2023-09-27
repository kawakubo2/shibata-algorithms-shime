package review_kawakubo;

import java.util.Scanner;

public class Ex148_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();//文字列は二つとも同じ長さ
		String str01 = sc.next();
		String str02 = sc.next();
		
		// 新しい文字列のコンストラクタ引数用配列
		char[] chars = new char[num * 2];
		int j = 0;
		for(int i = 0; i < num; i++) {
			chars[j++] = str01.charAt(i);
			chars[j++] = str02.charAt(i);
		}
		String newString = new String(chars);
		System.out.println(newString);

		sc.close();	
	}

}
