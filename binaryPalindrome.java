package test;

import java.util.Scanner;

public class binaryPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String binaryNum = Integer.toBinaryString(num);
        boolean isPalindrome = true;
        for (int i = 0; i < binaryNum.length()/2; i++) {
            if (binaryNum.charAt(i) != binaryNum.charAt(binaryNum.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(num + " is a binary palindrome");
        }
        else {
            System.out.println(num + " is not a binary palindrome");
        }
    }
}
