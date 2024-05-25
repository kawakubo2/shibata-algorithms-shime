package review;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex71_B_02 {

	static class SearchNotFound {

		String name;

		public SearchNotFound(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//入力された文字列を扱うクラス
		SearchNotFound target = new SearchNotFound(sc.next());
		
		//全アルファベットをchar型配列に格納する
		char[] allAlphabetArray = prepareAllAlphabet();
		
		//入力された文字列をCharacter型のSetに１文字ずつ格納する
		Set<Character> set = prepareSet(target.getName());
		
		//全アルファベットを一つずつ取り出して、Setと同じものがあるか調べる なければ表示する
		judge(allAlphabetArray, set);
		
		sc.close();
	}

	// 全アルファベットをchar型配列に格納するメソッド
	public static char[] prepareAllAlphabet() {

		StringBuffer sb = new StringBuffer();

		for (char c = 'a'; c < 'z'; c++) {
			sb.append(c);
		}

		String str = sb.toString();

		char[] allAlphabetArray = str.toCharArray();
		return allAlphabetArray;
	}

	//入力された文字列をCharacter型のSetに１文字ずつ格納するメソッド
	public static Set<Character> prepareSet(String name) {

		Set<Character> set = new HashSet<>();
		for (Character c : name.toCharArray()) {
			set.add(c);
		}
		
		return set;

	}
	
	//格納された全アルファベットを一つずつ取り出して、入力された文字列と同じものがあるか調べる
	public static void judge(char[] allAlphabet,Set<Character> set) {
		
		for(char c : allAlphabet) {
			//同じものがなければ表示する
			if(!set.contains(c)) {
				System.out.println(c);
				break;
			}
			
		}
		System.out.println("None");
	}
	
}
