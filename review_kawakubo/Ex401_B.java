package review_kawakubo;

import java.util.Scanner;

public class Ex401_B {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String[] statuses = new String[n];
		prepareStatuses(statuses, n, sc);

		ErrorCounter counter = new ErrorCounter(statuses);
		int errorCounts = counter.countError();
		showErrorCounts(errorCounts);

		sc.close();
		
	}

	public static void prepareStatuses(String[] statuses, int n, Scanner sc) {
		for (int i = 0; i < n; i++) {
			statuses[i] = sc.next();
		}
	}
	
	//エラー回数を表示
	public static void showErrorCounts(int error) {
		System.out.println(error);
	}
}
