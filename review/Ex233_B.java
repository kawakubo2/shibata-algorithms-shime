package review;

import java.util.Scanner;

public class Ex233_B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l;
		int r;
		String s;
		l = sc.nextInt();
		r = sc.nextInt();
		s = sc.next();
		
		
		//対象の範囲より前の部分を表示する
		for (int i = 0; i < l - 1; i++) {
			System.out.println("i " +  i);
			//System.out.print(s.charAt(i));
		}
		
		//ここでreverseする
		for (int j = r - 1; j >= l - 1; j--) {
			System.out.println("j " +  j);
			//System.out.print(s.charAt(j));
		}
		
		//対象の範囲より後の部分を表示する
		for (int k = r; k < s.length(); k++) {
			System.out.println("k " +  k);
			//System.out.print(s.charAt(k));
		}

		sc.close();
	}

}
