package review_kawakubo;

import java.util.Arrays;

public class Ex107_B_2 {

	/**
	 * 
	 * 問題	B - Grid Compression
ユーザ	jyd31 
	 * 
	 */
	
	
	public static void main(String[] args) {

		char[][][] grids = {
			{
				{'#', '#', '.', '#'},
				{'.', '.', '.', '.'},
				{'#', '#', '.', '#'},
				{'.', '#', '.', '#'},
			},
			{
				{'#', '.', '.'},
				{'.', '#', '.'},
				{'.', '.', '#'},
			},
			{
				{'.', '.', '.', '.', ','},
				{'.', '.', '.', '.', ','},
				{'.', '.', '#', '.', ','},
				{'.', '.', '.', '.', ','},
			},
			{
				{'.','.','.', '.', '.', '.'},
				{'.','.','.', '.', '#', '.'},
				{'.','#','.', '.', '.', '.'},
				{'.','.','#', '.', '.', '.'},
				{'.','.','#', '.', '.', '.'},
				{'.','.','.', '.', '.', '.'},
				{'.','#','.', '.', '#', '.'},
			}
		};		
		int index = 1;
		for (var grid : grids) {
			System.out.println("--- テスト" + index++ + " ---");
			int h = grid.length;
			int w = grid[0].length;
			boolean[] rows = new boolean[h];
			Arrays.fill(rows,false);
			
			boolean[] columns = new boolean[w];
			Arrays.fill(columns, false);
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					if(grid[i][j] == '#') {
						rows[i] = true;
						columns[j] = true;
					}
				}
			}
			
			for(int i = 0; i < h; i++) {
				if(rows[i]) {
					for(int j = 0; j < w; j++) {
						if(columns[j]) {
							System.out.print(grid[i][j]);
						}
					}
					System.out.println();
				}
				
			}
		}
		// sc.close();
	}
}
