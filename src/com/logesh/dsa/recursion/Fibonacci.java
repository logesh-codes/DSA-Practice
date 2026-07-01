package com.logesh.dsa.recursion;

public class Fibonacci {

    public static int fib(int n) {

        // base case
        if (n == 0) return 0;
        if (n == 1) return 1;

        // com.logesh.dsa.recursion
        return fib(n-1) + fib(n-2);


    }

    public static int fiboptimal(int n){
        if (n <=0 ) return 0;

        int prev1 = 1;
        int prev2 = 0;

        for (int i=1; i<n; i++){
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }

    static void main(String[] args) {
        int n = 4;

        System.out.println(fib(n));

        System.out.println(fiboptimal(n));
    }
}
