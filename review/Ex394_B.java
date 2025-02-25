package review;

import java.util.Scanner;

public class Ex394_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String[] str = new String[n];

		//String型の配列に文字列を格納する
		addArray(str, sc);
		
		//文字数の長さ順に昇順する
		ascendingOrder(str);
	
		//昇順後の配列の中身を表示する
		showResult(str);	
		
		sc.close();
	}

	public static void addArray(String[] str, Scanner sc) {
		
		for (int i = 0; i < str.length; i++) {
			str[i] = sc.next();
		}
	}
	
	public static void ascendingOrder(String[] str) {
		
		for (int i = 0; i < str.length -1; i++) {
			for(int j =  i + 1; j < str.length; j++) {
				if(str[i].length() > str[j].length()) {
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
	}
	
	public static void showResult(String[] str) {
		
		 for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]);
		}
		
	}
}
