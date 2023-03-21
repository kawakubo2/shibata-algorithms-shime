package chapter02;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
class CardConv3 {
    public static String cardConv(int x, int r) {
        List<String> list = new ArrayList<>();
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        do {
            System.out.printf(" %2d ) %8d %s%n", r, x, 
                list.size() != 0 ? " --- " + list.get(list.size() - 1) : "");
            System.out.printf("    +----------\n");
            list.add(String.valueOf(dchar.charAt(x % r)));
            x /= r;
        } while (x != 0);
        System.out.printf("      %8d  --- %s%n", 0, list.get(list.size() - 1));
        Collections.reverse(list);
        return list.stream()
            .collect(Collectors.joining());
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number; // 10進数の整数
        int card; // 何進数
        String cardStr;
        System.out.print("10進数整数: ");
        number = in.nextInt();
        System.out.print("基数(2-36): ");
        card = in.nextInt();
        cardStr = cardConv(number, card);
        System.out.printf("10進数の%dは%d進数で%sです。%n", number, card, cardStr);
        in.close();
    }
}
