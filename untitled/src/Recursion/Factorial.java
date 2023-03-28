package Recursion;

// Fact(N) = N * (N - 1) * (N - 2) *.......* 2 * 1

public class Factorial {
    public static void main(String[] args) {
        System.out.println(calculateFactorial(5));
    }

    static int calculateFactorial(int num) {
        //base case
        if(num == 1) {
            return  1;
        }

        int fact = num * calculateFactorial(num - 1);
        //main logic
        return fact;
    }
}
