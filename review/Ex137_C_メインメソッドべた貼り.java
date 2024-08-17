package review;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex137_C_メインメソッドべた貼り {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		long ans = 0;
		for(int i = 0; i < n; i++) {
			char[] s = sc.next().toCharArray();
			Arrays.sort(s);
			String str = String.valueOf(s);
			
			if(map.containsKey(str)) {
				ans += map.get(str);
				map.put(str, map.get(str) + 1);
			}else {
				map.put(str, 1);
			}
		}
		System.out.println(ans);

		sc.close();
	}

}
