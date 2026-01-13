package review;

import java.util.Scanner;

public class Ex439_A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int a = 1;
        for (int i = 0; i < N; i++) {
            a *= 2;
        }
        System.out.println(a - 2 * N);

        sc.close();
    }
}