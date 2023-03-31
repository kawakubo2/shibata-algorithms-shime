package chapter02;

public class PrimeNumber3 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int counter = 0;
        int ptr = 0;
        int[] prime = new int[500_000];
        prime[ptr++] = 2;
        prime[ptr++] = 3;
        for (int n = 5; n <= 1_000_000; n += 2) {
            boolean flag = false;
            int i;
            for (i = 1; prime[i] * prime[i] <= n; i++) {
                counter += 2;
                if (n % prime[i] == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                prime[ptr++] = n;
                counter++;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("処理時間: " + (end - start) + "ms");
        /*
        for (int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);
        }
        System.out.println("乗除算を行った回数: " + counter);
        */
    }
}