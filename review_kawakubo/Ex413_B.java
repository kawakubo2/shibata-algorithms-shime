package review_kawakubo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex413_B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] array = prepareArray(n, sc);

		Set<String> result = catArray(n, array);

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

	public static Set<String> catArray(int n, String[] array) {

		Set<String> set = new HashSet<>();

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				set.add(array[j] + array[i]);
				set.add(array[i] + array[j]);
			}
		}
		return set;
	}

	public static void showResult(Set<String> result) {

		System.out.println(result.size());

	}

}
