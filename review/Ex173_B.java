package review;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex173_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Map<String, Integer> map = new HashMap<>();
		
		String[] status = { "AC", "WA", "TLE", "RE" };
		
		for (int i = 0; i < 4; i++) {
			map.put(status[i], 0);
		}
			
		for (int j = 0; j < n; j++) {
			
			String s = sc.next();

			map.put(s, map.get(s) + 1);
		}
		
		System.out.println("AC x " + map.get("AC"));
		System.out.println("WA x " + map.get("WA"));
		System.out.println("TLE x " + map.get("TLE"));
		System.out.println("RE x " + map.get("RE"));

		sc.close();
	}

}
