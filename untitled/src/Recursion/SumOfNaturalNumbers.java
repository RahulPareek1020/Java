package Recursion;

// Sum(N) = N + (N - 1) + (N - 2) +.......+ 2 + 1

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(calculateSum(10));
    }

    static int calculateSum(int num) {
        //base case
        if(num == 0) {
            return  0;
        }

        //main logic
        return num + calculateSum(num - 1);
    }
}
