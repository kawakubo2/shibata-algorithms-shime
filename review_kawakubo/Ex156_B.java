package review_kawakubo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex156_B {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 指摘することが全くないので、実際どういう値になるか
		 * 表示するプログラムを紹介します。
		 * 一般のプログラム言語は2～36進数迄サポートしています。
		 * 36進以上も可能なのですが、英数字だけで表現すると
		 * 英字で26、数字で10、あわせて36になるから36進数迄
		 * サポートしているのかなと思っています。
		 * 今回は最大10進数迄なのですが36進数まで対応するように
		 * しました。
		 */

		String radixString = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		List<String> temp = new ArrayList<>();
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int count = 0;
		
		while(n > 0) {
			temp.add(String.valueOf(radixString.charAt(n % k)));
			n = n / k;
			count ++;
		}
		
		Collections.reverse(temp);
		String result = String.join("", temp);
		System.out.println(count);
		System.out.println(result);
		sc.close();
		
	}

}
