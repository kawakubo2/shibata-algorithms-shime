package review;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Ex413_B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] array = prepareArray(n, sc);

		List<String> list = catArray(n, array);

		Set<String> result = calcResult(list);
		showResult(result);

		sc.close();
	}

	public static String[] prepareArray(int n, Scanner sc) {

		String[] array = new String[n];

		for (int i = 0; i < n; i++) {
			array[i] = sc.next();
		}

		return array;
	}

	public static List<String> catArray(int n, String[] array) {

		List<String> list = new ArrayList<>();

		for (int j = 0; j < n; j++) {
			for (int i = j + 1; i < n; i++) {
				list.add(array[j] + array[i]);
				list.add(array[i] + array[j]);
			}
		}
		return list;
	}

	public static Set<String> calcResult(List<String> list) {

		Set<String> result = new HashSet<>(list);
		return result;

	}

	public static void showResult(Set<String> result) {

		System.out.println(result.size());

	}

}
