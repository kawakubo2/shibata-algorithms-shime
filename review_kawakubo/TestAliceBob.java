package review_kawakubo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestAliceBob {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
    
        List<Integer> array = new ArrayList<>();
        
        final int ALICE = 0;
        final int BOB = 1;
        int[] score = {0, 0}; // 0番目をAlice、1番目をBobのScoreとして使用します。
    
        for(int i = 0; i < num;i++){
            array.add(sc.nextInt());
        }
       
        /*
         * Arrays.sort(array);
         * for (int f = 0, l = array.length - 1; f < l; f++, l--){
         *     int temp = array[f];
         *     array[f]  = array[l];
         *     array[l] = temp;
         * }
         * List#sortは引数としてラムダ式を受け取れるので
         * 降順にソートするには以下のようにすれば簡単にできます。
         * b - aするとオーバーフローを起こすから書いてはダメと
         * している参考書もありますが、1 <= N <= 100であるので
         * 引き算で十分です。
         */ 

        array.sort((a, b) -> b - a); // 昇順の場合は a - b
    
        for(int i = 0; i < array.size() ;i++){
            System.out.printf("%d ", array.get(i));
        }
        System.out.println();

        /*
         * iは1個ずつ増えるので
         * i % 2
         * の結果が
         * 0(ALICE)であればscoreの0(ALICE)番目に加算し、
         * 1(BOB)であればscoreの1(BOB)番目に
         * 加算する。
         */
        for (int i = 0; i < array.size(); i++) {
            score[i % 2] += array.get(i);
        }

        System.out.println(score[ALICE] - score[BOB]);

        sc.close();
    }
   



}
