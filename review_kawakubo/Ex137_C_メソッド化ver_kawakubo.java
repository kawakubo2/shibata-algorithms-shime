package review_kawakubo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex137_C_メソッド化ver_kawakubo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String,Integer> map = new HashMap<String,Integer>();
		long count = 0;
		
		for(int i = 0; i < n; i++) {
			char[] array = prepareCharArray(sc);
			sortCharArray(array);
			String str = getStringfromArray(array);
			count += check(map, str); // ここで戻り値をcountに加算します。川久保注
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
	
	/*
	 * 川久保注
	 * countはlong型で基本型になります。基本型をメソッドの引数として受け取っても
	 * メソッド内でカウントアップしても、mainメソッドのcountと無関係なので、
	 * mainのcountは全く営業を受けません。
	 * 
	 * checkメソッドのcount変数で100番地、mainメソッドのcount変数が200番地に
	 * あると仮定し、checkメソッドを呼び出した場合、200番地の0の内容が0でその値だけが
	 * 100番地にコピーされます。その後100番地の値をカウントアップしたところで200番地
	 * の値には影響しません。
	 * 
	 * 今回はvoid型をlong型にし、戻り値として、mainのcheckメソッド呼び出しに戻すように
	 * すれば、値を取得することが可能です。
	 */
	// public static void check(Map<String,Integer> map,String str,long count) {
	public static long check(Map<String,Integer> map,String str) {
		long count = 0;
		if(map.containsKey(str)) {
			count += map.get(str);
			map.put(str, map.get(str) + 1);
		}else {
			map.put(str, 1);
		}
		return count;
	}
	
	public static void displayResult(long count) {
		System.out.println(count);
	}
}
