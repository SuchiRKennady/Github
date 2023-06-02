package com.bl.assign;

public class PrimeNumbers {
    public static void main(String[] args) {
        int prime;

        System.out.println("prime numbers");
        for (int i = 2; i <= 50; ++i) {
            prime=0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime++;
                    break;
                }
            }
            if (prime == 0)
                System.out.println(" "+i);
        }
    }
}
