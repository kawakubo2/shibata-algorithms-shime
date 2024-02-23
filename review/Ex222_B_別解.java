package review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex222_B_別解 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int p = sc.nextInt();
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			list.add(sc.nextInt());
			if(list.get(i) < p) {
				count ++;
			}
		}
		
		System.out.println(count);
		
		sc.close();	
		
	}
}
