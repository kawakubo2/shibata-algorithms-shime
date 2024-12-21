package review_kawakubo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex355_B_03 {

	public static void main(String[] args) {

		//数列A,Bの点数をkeyとして、Valueを"A"or"B"にする
		//問題分で”A,B のすべての要素は互いに相異なり”と記載されているのでKeyの重複の心配はない
		Map<Integer, String> map = new TreeMap<Integer, String>();

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		
		
		// 数列A分の要素をmapに格納する
		put_A_Map(sc, n, map);
		
		//数列B分の要素をmapに格納する
		put_B_Map(sc, m, map);

		//mapのvalueの要素とその次の要素を比較したいために用意した変数
		List<String> judgeList = new ArrayList<String>();
		
		//mapのkeyをlistに格納する
		addMapToList(map, judgeList);
		
		//valueの要素とその次の要素が同じか判断する
		isAB(judgeList);
		
		//判定結果を表示する
		showResult(judgeList);

		sc.close();
		
	}

	// 数列A分の要素をmapに格納する *keyは点数にする
	public static void put_A_Map(Scanner sc, int n, Map<Integer, String> map) {
		
		for (int i = 0; i < n; i++) {
			map.put(sc.nextInt(), "a");
		}
	}

	// 数列B分の要素をmapに格納する *keyは点数にする
	public static void put_B_Map(Scanner sc, int m, Map<Integer, String> map) {
	
		for (int i = 0; i < m; i++) {
			map.put(sc.nextInt(), "b");
		}
	}

	//mapのkeyをlistに格納する
	public static void addMapToList(Map<Integer, String> map, List<String> judgeList) {

		for (Integer num : map.keySet()) {

			judgeList.add(map.get(num));
		}

	}
	
	//valueの要素とその次の要素が同じか判断する
	public static boolean isAB(List<String> judgeList) {
		
		boolean flag = false;
		
		for(int i = 0; i < judgeList.size() -1 ; i++) {
			if(judgeList.get(i).equals(judgeList.get(i+ 1))) {
				return flag = true;
			}
		}
		return flag;
		
	}
	
	
	//判定結果を表示する
	public static void showResult(List<String> judgeList) {
		
		if(isAB(judgeList)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
