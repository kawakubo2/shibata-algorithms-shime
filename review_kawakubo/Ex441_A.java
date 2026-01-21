package review_kawakubo;

import java.util.Scanner;

public class Ex441_A {

    private static int N = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int Q = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        System.out.println(contains(P, Q, X, Y) ? "Yes" : "No");

        sc.close();
    }

    private static boolean contains(int P, int Q, int X, int Y) {
        return X >= P && X <= P + (N - 1) && Y >= Q && Y <= Q + (N - 1);
    }
}
