package PrintToHundred;

public class PrintOneToHundred implements  Runnable{
    int _NoToPrint;
    PrintOneToHundred(int NoToPrint) {
        this._NoToPrint = NoToPrint;
    }

    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println("Hello world " + this._NoToPrint  + " printed by " + Thread.currentThread().getName());
        }
    }
}
