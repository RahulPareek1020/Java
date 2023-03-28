package IntroToThread;

import PrintToHundred.PrintOneToHundred;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello world, printed by " + Thread.currentThread().getName());

        HelloWorldPrint hwp = new HelloWorldPrint();
        //PrintOneToHundred pr = new PrintOneToHundred();

        Thread t = new Thread(hwp);
        //hwp.run();
        t.start();

        System.out.println("Hello world, printed again by " + Thread.currentThread().getName());
    }
}
