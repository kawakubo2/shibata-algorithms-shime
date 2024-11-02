package review;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex166_B {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        
        //人数
        int n = sc.nextInt();
        
        //お菓子の種類
        int k = sc.nextInt();
        
        
        for(int i=0; i<k; i++) {
            int d = sc.nextInt();
            for(int j=0; j<d; j++) {
                int a = sc.nextInt();
                set.add(a);
            }
        }
        
        //（全体の人数）‐（お菓子を持っている人数）＝残りの何も持っていない人
        System.out.println(n-set.size());

        sc.close();
    }

}
