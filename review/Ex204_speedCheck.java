package review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex204_speedCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		//testデータ準備
		Integer[] array = prepareArray(sc, n);
		List<Integer> list = prepareList(sc, n);
		
		System.out.println("---<List version>---");
		long startTestList = System.nanoTime();
		System.out.println(testList(list));
		long endTestList = System.nanoTime();
		System.out.printf("処理時間: %dナノ秒%n",(endTestList - startTestList));
		
		System.out.println("---<配列 version>---");
		long startTestArray = System.nanoTime();
		System.out.println(testArray(array));
		long endTestArray = System.nanoTime();
		System.out.printf("処理時間: %dナノ秒%n",(endTestArray - startTestArray));
		
		sc.close();
		
	}

	public static Integer[] prepareArray(Scanner sc, int n) {
		Integer[] array = new Integer[n];

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		return array;
	}

	public static List<Integer> prepareList(Scanner sc,int n){
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			list.add(x);	
		}
		return list;
	}

	public static int testArray(Integer[] array) {

		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > 10) {
				sum += array[i] - 10;
			}
		}
		return sum;

	}

	public static int testList(List<Integer> list) {

		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > 10) {
				sum += list.get(i) - 10;
			}
		}
		return sum;
	}

}
