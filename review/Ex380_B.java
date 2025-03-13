package review;

import java.util.Scanner;

public class Ex380_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char[] charArray = sc.next().toCharArray();
		int count = 0;
		
		count(charArray, count);

		sc.close();
		
	}

	//'-'の数を数える　（内部にshowメソッドでcount数の表示機能も呼び出している）
	public static void count(char[] charArray, int count) {

		for (int i = 1; i < charArray.length; i++) {
			if (charArray[i] == '-') {
				count++;
			} else {
				show(count);
				count = 0;
			}
		}
	}

	public static void show(int count) {
		System.out.print(count + " ");
	}

}
