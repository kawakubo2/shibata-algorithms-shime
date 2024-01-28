package review;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex201_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] list = new int[n];
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		for(int i = 0; i < n; i++) {
			String str = sc.next();
			int height = sc.nextInt();
			list[i] = height;
			map.put(height,str);
		}
	
		Arrays.sort(list);
		//降順なので後ろから二番目がsecond heighest mountain
		System.out.println(map.get(list[n -2]));

		sc.close();
	}

}
