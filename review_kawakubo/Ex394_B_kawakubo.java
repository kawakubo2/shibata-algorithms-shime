package review_kawakubo;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex394_B_kawakubo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Map<Integer, String> map = new TreeMap<>();
		
		putMap(map, n, sc);

		showResult(map);	
		
		sc.close();
	}

	public static void putMap(Map<Integer, String> map, int n, Scanner sc) {
		for (int i = 0; i < n; i++) {
			String val = sc.next();
			map.put(val.length(), val);
		}
	}
	
	public static void showResult(Map<Integer, String> map) {
		System.out.println(map.values().stream().reduce((result, s) -> result + s).get());	
	}
}
