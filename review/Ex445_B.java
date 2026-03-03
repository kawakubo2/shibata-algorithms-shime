package review;

import java.util.Scanner;

public class Ex445_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int N = sc.nextInt();
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.next();
            if (max < S[i].length()) {
                max = S[i].length();
            }
        }
        for (int i = 0; i < N; i++) {
            int num = max - S[i].length();
            num = num / 2;
            StringBuffer str = new StringBuffer();
            for (int j = 0; j < num; j++) {
                str.append('.');
            }
            str.append(S[i]);
            for (int j = 0; j < num; j++) {
                str.append('.');
            }
            System.out.println(str.toString());
        }
        sc.close();
    }
}
