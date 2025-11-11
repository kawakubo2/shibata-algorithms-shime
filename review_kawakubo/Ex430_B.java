package review_kawakubo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Ex430_B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        char[][] grid = new char[n][m];

        for (int i = 0; i < n; i++) {
            grid[i] = sc.next().toCharArray();
        }

        Set<List<Character>> set = new HashSet<>();
        for (int i = 0; i <= n - m; i++) {
            for (int j = 0; j <= n - m; j++) {
                List<Character> list = new ArrayList<>();
                for (int k = 0; k < m; k++) {
                    for (int l = 0; l < m; l++) {
                        list.add(grid[i + k][j + l]);
                    }
                }
                set.add(list);
            }
        }
        System.out.println(set.size());

        sc.close();
    }
}
