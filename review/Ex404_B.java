package review;

import java.util.Scanner;

public class Ex404_B {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[][] S = new char[n][n];
		char[][] T = new char[n][n];
		
		for(int i = 0; i < n; i++) {
			S[i] = sc.next().toCharArray();
		}
		
		for(int i = 0; i < n; i++) {
			T[i] = sc.next().toCharArray();
		}
		
		int ans = Integer.MAX_VALUE;
		
		//SとTの塗り替え必要なマスを計算してから90度回転する
		//90度回転4回すると１周なので4を指定
		for(int i = 0; i < 4; i++) {
			//変更回数　= check(S,T)+ i（回転数）
			ans = Math.min(ans, check(S,T) + i);
			System.out.println("ans = " + ans + " i=" + i);
			S = rotato(S);
		}
		System.out.println(ans);

		sc.close();
		
	}

	//SとTのマスの違いを計算（塗り替えが必要なマスの数を計算）
	static int check(char[][] S, char[][] T) {
		int count = 0;
		
		System.out.println("S");
		for(int i = 0; i < S.length; i++) {
			for(int j = 0; j < S.length; j++) {
				System.out.print(S[i][j]);
				if(S[i][j] != T[i][j]) {
					count++;
				}
			}
			System.out.println();
		}
		
		System.out.println("T");
		for(int i = 0; i < S.length; i++) {
			for(int j = 0; j < S.length; j++) {
				System.out.print(T[i][j]);
			}
			System.out.println();
		}
		return count;
		
	}
	
	//90度回転するメソッド
	static char[][] rotato(char[][] S){
		char[][] rS = new char[S.length][S.length];
		
		for(int  i = 0; i < S.length; i++) {
			for(int j = 0; j <S.length; j++) {
				rS[j][S.length - i -1] = S[i][j];
			}
		}
		return rS;
	}
}
