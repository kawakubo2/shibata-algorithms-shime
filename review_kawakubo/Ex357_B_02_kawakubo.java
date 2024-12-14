package review_kawakubo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex357_B_02_kawakubo {
	private static enum CASE_CATEGORY { UPPER, LOWER };
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		char[] charArray = prepareToArray(str);
		
		Map<CASE_CATEGORY, Integer> counter = new HashMap<CASE_CATEGORY, Integer>() {
			{
				put(CASE_CATEGORY.UPPER, 0);
				put(CASE_CATEGORY.LOWER, 0);
			}
		};

		count(charArray, counter);

		show(str, counter);
		
		sc.close();
	}

	public static char[] prepareToArray(String str) {
		char charArray[] = str.toCharArray();
		return charArray;
	}

	public static void count(char[] charArray, Map<CASE_CATEGORY, Integer> counter) {
		for (char c : charArray) {
			if (Character.isLowerCase(c)) {
				counter.put(CASE_CATEGORY.LOWER, counter.get(CASE_CATEGORY.LOWER) + 1);	
			} else {
				counter.put(CASE_CATEGORY.UPPER, counter.get(CASE_CATEGORY.UPPER) + 1);	
			}
		}
	}
	public static void show(String str, Map<CASE_CATEGORY, Integer> counter) {
		if(counter.get(CASE_CATEGORY.LOWER) > counter.get(CASE_CATEGORY.UPPER)) {
			System.out.println(str.toLowerCase());
		}else {
			System.out.println(str.toUpperCase());
		}
	}
}
