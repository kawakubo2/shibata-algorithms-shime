package review_kawakubo;

import java.util.Scanner;

public class Ex157_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*
         * 整数は奇数か偶数なのでelseが発生することはありません。
         */
        if(n % 2 != 0){
            System.out.println( (n / 2) + 1);
        // }else if(n  % 2 == 0){
        } else {
            System.out.println(n / 2);
        } /* else {
            System.out.println("もう一度やり直してください");
        }*

        /*
         * 偶数は2で割り切れるので、そのままで
         * 奇数は切上げすればいいかと思います。
         * 可読性から言えば七五三さんの方が
         * いいです。下記のように書けないこと
         * もないし、現にこういう書き方をする人も
         * 多いので慣れておくといいと思います。
         * 
         */
        System.out.println((int)Math.ceil((double)n / 2));


        sc.close();
    }
}
