package review_kawakubo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex070_B_ほかの人のコード {

	public static void main(String[] args) throws IOException {

		final BufferedReader reader =
				new BufferedReader(new InputStreamReader(System.in));

		System.out.println(execute(reader));
	}

	static String execute(final BufferedReader reader) throws IOException {

		final Scanner sc = new Scanner(reader);
		final int aliceBegin  = sc.nextInt();
		final int aliceStop = sc.nextInt();
		final int bobBegin  = sc.nextInt();
		final int bobStop = sc.nextInt();

		sc.close();

		if (aliceStop <= bobBegin || bobStop <= aliceBegin) return "0";
		return Integer.toString(Math.min(aliceStop, bobStop) - Math.max(aliceBegin, bobBegin));
	}

}
