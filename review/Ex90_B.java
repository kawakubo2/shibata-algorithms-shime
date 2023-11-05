package review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex90_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		
		for(int i = a; i <= b; i++) {
			String ans = getPalindromicNum(i);
			if(ans.equals(String.valueOf(i))) {
				System.out.println(ans);
				count ++;
			}
		}
		System.out.println(count);
		
		sc.close();
	}
	
	public static String getPalindromicNum (int n) {

		List<String> list = new ArrayList<String>(); 
		
		while(n > 0) {
			list.add(String.valueOf(n % 10));
			n /= 10;
		}
		
		String ans = list.stream().collect(Collectors.joining());
		return ans;	
	}

}
