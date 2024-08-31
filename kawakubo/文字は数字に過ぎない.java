package kawakubo;

public class 文字は数字に過ぎない {
    public static void main(String[] args) {
        for (char c = 'ァ'; c <= 'ン'; c++) {
            System.out.println(c + ": " + (int)c);
        }
    }
}
