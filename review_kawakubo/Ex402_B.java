package review_kawakubo;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex402_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int q = sc.nextInt();

		LinkedList<Integer> que = new LinkedList<>();
		
		getWaitingList(que, sc, q);

		sc.close();

	}

	public static void getWaitingList(Deque<Integer> que,Scanner sc,int q) {

		for (int i = 0; i < q; i++) {

			int t = sc.nextInt();

			if (t == 1) {
				int x = sc.nextInt();
				que.addLast(x);
			} else {
				System.out.println(que.peekFirst());
				que.pollFirst();
			}

		}

	}

}
