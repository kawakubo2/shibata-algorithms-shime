package experiment;

import java.util.Scanner;

public class Q214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int T = sc.nextInt();

        long start = System.nanoTime();
        int counter = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        for (i = 0; i <= S; i++) {
            if (i > T && (j != 0 && k != 0)) break;
            for (j = 0; i + j <= S; j++) {
                if (i * j > T && k != 0)
                for (k = 0; i + j + k <= S; k++) {
                    if (i * j * k > T) break;
                    counter++;
                }
            }
        }
		long end = System.nanoTime();
        System.out.println(counter);
		System.out.printf("処理時間=%dナノ秒%n", (end - start));
        sc.close();
    }

}
