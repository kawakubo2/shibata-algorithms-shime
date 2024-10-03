package review;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex371_B {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			String b = sc.next();
			if(b.equals("F")) {
				System.out.println("No");
			}else if(b.equals("M")) {
				if(set.contains(a)) {
					System.out.println("No");
				}
			}else {
				System.out.println("Yes");
				set.add(a);
			}
		}
		
		sc.close();		
	}
}
