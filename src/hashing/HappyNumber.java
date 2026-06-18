package hashing;

import java.util.HashSet;

public class HappyNumber {

    public static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while(n !=1 && !seen.contains(n)){

            seen.add(n);
            n = getNext(n);
        }

        return n == 1;
    }

    public static int getNext(int n){
        int sum = 0;

        while(n > 0){
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 19;
        //int n = 2;
        System.out.println(n + " is happy :" + isHappy(n));

    }

}
