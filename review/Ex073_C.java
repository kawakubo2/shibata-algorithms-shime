package review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex073_C {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			int target = sc.nextInt();
			//System.out.println("target" + target);
			
			if(list.contains(target)) {
				list.remove(target);
			}
			
			if(!list.contains(target)) {
				list.add(target);
			}
		
		}
		System.out.println(list.size());
		
		sc.close();
	}

}
