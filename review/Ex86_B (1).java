package AtCoderBeginnerContest;

import java.util.Scanner;

public class Ex86_B {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
	
		double target = Double.parseDouble(a + b);
		System.out.println("a + b= " + target);
		
		
		double ansDouble = Math.sqrt(target);
		System.out.println("平方根(double) " + ansDouble);
		
		int ansInteger = (int)Math.sqrt(target);
		System.out.println("平方根(int) " + ansInteger);
		
		System.out.println("doubleの結果 " + ansDouble * ansDouble);
		System.out.println("intの結果" + ansInteger * ansInteger);
		
		if(ansDouble == ansInteger) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
