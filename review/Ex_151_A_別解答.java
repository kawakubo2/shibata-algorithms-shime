package review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_151_A_別解答 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Character> list = new ArrayList<Character>();
		for (char c = 'a'; c <= 'z'; c++) {
			list.add(c);
		}
		
		System.out.print("アルファベットを一文字入力せよ：");
		char ans = sc.next().charAt(0);
		
		for(Character ch : list){
			if(ch == ans) {
				System.out.println((char) ((int)(ch + 1)));
				//下記コードだとOutoｆBoundExceptionが発生する
				//System.out.println(list.get(list.indexOf((ch + 1))));		
			}
		}	
		sc.close();
	}
	
	/**
	 * エラー　Iteratorでトライしたコード　でもoutofBoundExceptionが出た
	 * Iterator<Character> itr = list.iterator();
		
		while(itr.hasNext()) {
			char target = itr.next();
			if(target == ans) {
				System.out.println(list.get(list.indexOf((target + 1))));
			}
		}
	 * 
	 * 
	 */
	

}
