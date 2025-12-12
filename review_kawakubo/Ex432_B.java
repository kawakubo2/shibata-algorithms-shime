package review_kawakubo;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex432_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Character> list = sc.next()
				.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.toList());
		Collections.sort(list);

		int index = list.lastIndexOf('0');
		if (index > -1) {
			char c = list.get(index + 1);
			list.set(index + 1, list.get(0));
			list.set(0, c);
		}

		System.out.println(
				list
						.stream()
						.map(String::valueOf)
						.collect(Collectors.joining()));

		sc.close();

	}

}
