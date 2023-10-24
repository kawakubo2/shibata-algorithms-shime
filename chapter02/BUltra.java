package chapter02;

import java.util.Random;

public class BUltra implements IB{

    @Override
    public void x() {
        System.out.println("BSub#xメソッド");
    }

    @Override
    public boolean y() {
        Random r = new Random();
        return  (r.nextInt(100) > 20); 
    }

    @Override
    public void z() {
        System.out.println("BStub爆速メソッド");
    }
}
