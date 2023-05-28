package test;

import java.util.Scanner;

public class CRT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] rems = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            rems[i] = sc.nextInt();
        }
        while (true) {
            int i;
            for (i = 0; i < n; i++) {
                if (x%nums[i] != rems[i]) {
                    break;
                }
            }
            if (i == n) {
                System.out.println("Solution is " + x);
                break;
            }
            x++;
        }
    }
}
