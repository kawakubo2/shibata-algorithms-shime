package review_kawakubo;

public class Ex107_B {

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
		/*
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		char[][] grid = new char[h][w];
		
		for(int i = 0; i< h; i++) {
			String s = sc.next();
			for(int j = 0; j < w; j++) {
				grid[i][j] = s.charAt(j);
			}
		}
		
		boolean[] rows = new boolean[h];
		//初期値をfalseに設定
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
		*/
		for (var grid : grids) {
			for(int i = 0; i < grid.length; i++) {
				for(int j = 0; j < grid[i].length; j++) {
					System.out.print(grid[i][j]);
				}
				System.out.println();
			}
		}
		// sc.close();
	}
}
