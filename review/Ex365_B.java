package review;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex365_B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for (int i = 0; i < n; i++) {
		  array[i] = sc.nextInt();
		  //mapのkeyを配列の中身、valueを配列のインデックスに設定する
		  map.put(array[i], i);
		}
	
		Arrays.sort(array);
		
		int target = array[n - 2];
		
		System.out.println(map.get(target) + 1);

		sc.close();
	}

}
