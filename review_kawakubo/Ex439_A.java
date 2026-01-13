package review_kawakubo;

import java.util.Scanner;

public class Ex439_A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int a = power(2, N);
        System.out.println(a - 2 * N);

        sc.close();
    }

    private static int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}