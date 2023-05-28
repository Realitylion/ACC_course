package test;

import java.util.Scanner;

public class eulersPhiFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        int result = n;
        for (int i = 2; i*i <= n; i++) {
            if (n%i == 0) {
                while (n%i == 0) {
                    n /= i;
                }
                result -= result/i;
            }
        }
        if (n>1) {
            result -= result/n;
        }
        System.out.println("Euler phi(" + num + ") = " + result);
    }
}
