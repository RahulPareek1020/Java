package PrintToHundred;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello world, printed by " + Thread.currentThread().getName());

        //HelloWorldPrint hwp = new HelloWorldPrint();
        //PrintOneToHundred pr = new PrintOneToHundred();

        //Thread t = new Thread(hwp);
        //hwp.run();
        //t.start();

        for(int i = 0; i < 100; i++) {
            PrintOneToHundred pr = new PrintOneToHundred(i);
            Thread t1 = new Thread(pr);
            t1.start();
        }

        System.out.println("Hello world, printed again by " + Thread.currentThread().getName());
    }
}
