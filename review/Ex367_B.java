package review;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex367_B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		
		DecimalFormat df = new DecimalFormat("#.###");
		String str = df.format(x);
		
		System.out.println(str);

		sc.close();

	}

}
