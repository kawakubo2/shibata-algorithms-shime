package review_kawakubo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex373_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		long start = System.nanoTime();

		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), i);
		}
		
		int count = 0;
		
		//A,B,C....アルファベット順に呼び出して、各文字がどの位置にあるか調べる
		//隣同士の文字（例:AとB、CとD)の距離を絶対値で引いて求める
		for(int i = 1; i < 26; i++) {
			
			int startDistance = map.get((char)('A' + (i -1)));
			
			
			int endDistance = map.get((char) ('A' + i));
			
			count += Math.abs(endDistance - startDistance);
			
		}

		long end = System.nanoTime();
		
		System.out.println(count);
		System.out.printf("処理時間: %dナノ秒%n", (end - start));
		

		sc.close();
	}

}
