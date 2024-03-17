package review_kawakubo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex344_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<Integer>();

		int num = -1;
		while(num != 0) {
			num = sc.nextInt();
			list.add(num);
		}
		
		for(int i = list.size() -1; i >= 0; i--) {
			System.out.println(list.get(i));
		}
		
		sc.close();
	}

}
