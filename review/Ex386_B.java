package review;

import java.util.Scanner;

public class Ex386_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int count = 0;
		
		count = getCount(count, str);
		showResult(count, str);

		sc.close();
	}
	

	//"00"を押す回数を求める
	public static int getCount(int count, String str) {
		
		for(int i = 0; i < str.length() -1; i++) {
			char c = str.charAt(i);
			if(c == '0' && str.charAt(i + 1) == '0') {
				count ++;
				i ++;
			}
			
		}
		return count;	
	}
	
	//最小値の回数を表示する　(文字列の長さ - "00"の回数)
	public static void showResult(int count,String str) {
		System.out.println(str.length() - count);
	}
}
