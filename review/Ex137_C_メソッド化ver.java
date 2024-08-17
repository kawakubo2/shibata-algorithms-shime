package review;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex137_C_メソッド化ver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String,Integer> map = new HashMap<String,Integer>();
		long count = 0;
		
		for(int i = 0; i < n; i++) {
			char[] array = prepareCharArray(sc);
			sortCharArray(array);
			String str = getStringfromArray(array);
			check(map, str, count);
		}
		displayResult(count);
		
		sc.close();
	}
	
	public static char[] prepareCharArray(Scanner sc) {
		char[] array = sc.next().toCharArray();
		return array;
	}
	
	public static void sortCharArray(char[] array) {
		Arrays.sort(array);
	}

	public static String getStringfromArray(char[] array) {
		String str = String.valueOf(array);
		return str;
	}
	
	public static void check(Map<String,Integer> map,String str,long count) {
		if(map.containsKey(str)) {
			count += map.get(str);
			map.put(str, map.get(str) + 1);
		}else {
			map.put(str, 1);
		}
	}
	
	public static void displayResult(long count) {
		System.out.println(count);
	}
}
