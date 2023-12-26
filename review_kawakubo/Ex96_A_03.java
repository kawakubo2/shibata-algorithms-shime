package review_kawakubo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex96_A_03 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			//monthを入力
			int a = Integer.parseInt(br.readLine());
			//dayを入力
			int b = Integer.parseInt(br.readLine());
			
			int count = 0;
			for(int i = 1; i <= a; i++) {
				for(int j = 1; j <= b; j++) {
					if(i == j) {
						//month == dayならカウントする
						count ++;
					}
					
					if((i == a && j == b) && (i != j)) {
						//i==a月かつj==b日　&& iとjの値が異なる場合
						//例: 8月7日 iとjが8月7日までfor文回ってこの二つの値が同じでない場合continueする
						continue;
					}
				}
			}
			
			System.out.println(count);
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
