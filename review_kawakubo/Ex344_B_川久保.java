package review_kawakubo;

import java.util.Scanner;
import java.util.Stack;

public class Ex344_B_川久保 {

	public static void main(String[] args) {

		/*
		 * 川久保
		 * 特に指摘することがないので、Stackで解いてみました。
		 * Stackはご存じだと思いますが、最後に入れたものから
		 * 最初に取り出す(Last In First Out(LIFO))構造なので
		 * 今回はStackが楽かなと思います。もちろん、配列、
		 * ArrayList、LinkedListを使用しても構いません。
		 */
		Scanner sc = new Scanner(System.in);
		
		var stack = new Stack<Integer>();
		int num = -1;
		while(num != 0) {
			num = sc.nextInt();
			stack.push(num);
		}
		
		// 川久保
		while(stack.size() > 0) {
			System.out.println(stack.pop());
		}
		
		sc.close();
	}

}
