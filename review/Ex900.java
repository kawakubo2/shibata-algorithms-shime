package review;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex900 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            map.put(a[i], i + 1);
        }
        Arrays.sort(a);
        System.out.println(map.get(a[0]) + " " + map.get(a[1]) + " " + map.get(a[2]));

        scanner.close();
    }
}
