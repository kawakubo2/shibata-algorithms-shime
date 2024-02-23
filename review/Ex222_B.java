package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex222_B {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int n = Integer.parseInt(br.readLine());
			
			int p = Integer.parseInt(br.readLine());
			
			int[] points = new int[n];
			
			for(int i = 0; i < points.length; i++) {
				points[i] = Integer.parseInt(br.readLine());
			}
			
			int count = countFailStudent(points, p);
			System.out.println(count);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static int countFailStudent(int[] x, int point) {
		
		int count = 0;
		
		for(int i = 0; i < x.length; i++) {
			if(x[i] < point) {
				count ++;
			}
		}
		return count;
	}

}
