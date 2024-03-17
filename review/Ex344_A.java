package review;

import java.util.Scanner;

public class Ex344_A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int result01 = str.indexOf("|");
		System.out.println("result01:  " + result01);
		
		int result02 = str.lastIndexOf("|");
		System.out.println("result02:  " + result02);
		
		//最初の|より前の文字列だけ抽出する
		String str01 = str.substring(0,result01);
		
		System.out.println(str01 + str.substring(result02 + 1));
		
		sc.close();
	}

}
