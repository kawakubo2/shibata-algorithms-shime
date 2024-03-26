package review;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex85_B_02 {

	public static void main(String[] args) {

		//今回重複したサイズはカウントしないのでSetが有効
		
		Set<Integer> set = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
	

		for (int i = 0; i < num; i++) {
			int a = sc.nextInt();
			set.add(a);
		}
		
		System.out.println(set.size());

		sc.close();
	}

}
