package IntroToThread;

import javax.swing.plaf.TableHeaderUI;

public class HelloWorldPrint implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello world, printed by " + Thread.currentThread().getName());
    }
}
