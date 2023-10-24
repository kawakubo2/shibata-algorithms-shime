package chapter02;

import java.util.Random;

public class B implements IB{
    public void x() {
        System.out.println("B#xメソッド");
    }
    public boolean y() {
        Random r = new Random();
        return  (r.nextInt(100) > 20); 
    }
    public void z() {
        System.out.println("B#xメソッド(完成)");
    }
}
