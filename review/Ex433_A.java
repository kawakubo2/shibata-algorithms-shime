package review;

import java.util.Scanner;

public class Ex433_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();

        sc.close();

        for (int i = 0; i <= 100; i++) {
            if (X + i == Z * (Y + i)) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");

    }
}
