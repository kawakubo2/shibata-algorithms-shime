package review;

import java.util.Scanner;

public class Ex357_B_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		//文字列をchar型の配列にする
		char[] charArray = prepareToArray(str);
		
		//小文字を数える
		int lowerCount = countLower(charArray);
		
		//大文字を数える
		int upperCount = countUpper(charArray);
		
		//小文字、もしくは大文字の多いほうに変換して出力する
		show(lowerCount, upperCount, str);
		
		sc.close();
	}

	public static char[] prepareToArray(String str) {
		char charArray[] = str.toCharArray();
		return charArray;
	}

	public static int countLower(char[] charArray) {

		int lowerCount = 0;

		for (char c : charArray) {
			if (Character.isLowerCase(c)) {
				lowerCount++;
			}
		}
		return lowerCount;

	}

	public static int countUpper(char[] charArray) {

		int UpperCount = 0;

		for (char c : charArray) {
			if (Character.isUpperCase(c)) {
				UpperCount++;
			}
		}
		return UpperCount;

	}
	
	public static boolean isLower(int lowerCount, int upperCount) {
		
		if(lowerCount > upperCount) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void show(int lowerCount, int upperCount, String str) {
		if(isLower(lowerCount, upperCount)) {
			System.out.println(str.toLowerCase());
		}else {
			System.out.println(str.toUpperCase());
		}
	}

}
