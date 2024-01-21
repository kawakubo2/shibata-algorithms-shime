package chapter02;

public class ひらがなカタカナ {
    public static void main(String[] args) {
        for (char c = 'ぁ'; c <= 'ん'; c++) {
            System.out.println(c + " の文字コードは " + (int)c);
        }
        for (char c = 'ァ'; c <= 'ン'; c++) {
            System.out.println(c + " の文字コードは " + (int)c);
        }
    }
}
