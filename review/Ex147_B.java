package review;

import java.util.Scanner;

public class Ex147_B {

	//https://atcoder.jp/contests/abc147/tasks/abc147_b
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		char[] chararray = str.toCharArray();
		int count = 0;
		
		int half = chararray.length/2;
		
		for(int i = 0; i < half; i++) {
			if(chararray[i] != chararray[chararray.length -i-1]) {
				count++;
			}
		}
		System.out.println(count);
		
		sc.close();
	}

}
