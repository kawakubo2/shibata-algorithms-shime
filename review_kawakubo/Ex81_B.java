package review_kawakubo;

import java.util.Scanner;

public class Ex81_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] x = new int[num];

        for(int i = 0; i < x.length;i++){
            x[i] = sc.nextInt();
        }

        int max = x[0];
        /*
        for(int i = 1; i < x.length; i++){
            if(x[i -1] < x[i]){
                max = x[i];
            }
        }
        上記の解き方でも最大値は求まりますが、直感的でわかりやすいのは以下の解き方です。
        */
        for (int i = 1; i < x.length; i++) {
            if (x[i] > max) max = x[i];
        }
        
        System.out.println("max=" + max);
        
        // 内側に入った回数
        int n = 0;
        // 2で割った回数
        int count = 0;
        outer:
        /*
        以下の判定は必要ないと考えられます。
        for(int i = 0; i <= max / 2; i++){

        例えば、以下のように入力した場合、
        3
        512 1024 512

        最大値は1024となりiは512回も回りますが、
        ループを回す回数と最大値は今回は関連性はありません。
        今回は必ず割った結果はどこかで奇数となるので、
        それが終了条件となります。したがってwhile(true)
        で大丈夫です。無限ループにはなりません。
        
        */
        while (true) {
            for(int j = 0; j < x.length; j++){
                n++;
                if( x[j] % 2 != 0){
                    break outer;
                }
                x[j] = x[j] / 2;
            }
            count ++;
        }
        System.out.println(count);
        System.out.println("ループ回数=" + n);
        sc.close();
    }
}
