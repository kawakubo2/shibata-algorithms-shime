package review;
import java.util.Scanner;

public class Ex389_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		long x = sc.nextLong();
		
		
		for(int i = 0; i <= x; i++) {
			int n = 1;
			for(int j = i; j > 0; j--) {
				n *= j;
			}
			
			if(n == x) {
				System.out.println(i);
				break;
			}
			
		}

		sc.close();
		
	}

}
