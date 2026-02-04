package review_kawakubo;

import java.util.*;

public class Ex443_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        // 0年目の処理
        int year = 0;
        int total = N;
        // 1年目以降の処理
        while (total < K) {
            N += 1;
            total += N;
            year++;
        }
        System.out.print(year);

        sc.close();
    }
}