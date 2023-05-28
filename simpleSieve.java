package test;

import java.util.Scanner;

public class simpleSieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int lowerLimit = sc.nextInt();
        int upperLimit = sc.nextInt();
        boolean[] isPrime = new boolean[upperLimit+2];
        for (int i = 2; i <= upperLimit; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i <= upperLimit; i++) {
            if (isPrime[i]) {
                for (int j = i*i; j <= upperLimit; j=j+i) {
                    isPrime[j] = false;
                }
            }
        }

        System.out.print("Prime numbers from " + lowerLimit + " to " + upperLimit + ": ");
        for (int i = lowerLimit; i < upperLimit; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
