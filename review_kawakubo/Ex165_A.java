package review_kawakubo;

import java.util.Scanner;

public class Ex165_A {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        /*
         * aをkで割ったあまりではなく、
         * iをkで割ったあまりですね。
         * 1個見つけたらループを抜けた方が
         * 処理が速くなりいいかと思います。
         * breakを入れないとOKが何個も
         * 表示されるし。。。
         */
        for(int i = a; i <= b; i ++){
            // if(a % k == 0){
            if(i % k == 0){
                System.out.println("OK");
                break;
            }
        }
        sc.close();
    }
}
