package test;

import java.util.Scanner;

public class stroboNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        char curChar, curLastIndex;
        boolean strogo = true;
        for (int i = 0; i <= number.length()/2; i++) {
            if (!strogo)
                break;
            curChar = number.charAt(i);
            curLastIndex = number.charAt(number.length() - 1 - i);
            switch (curChar) {
                case '0':
                    if (curLastIndex != '0')
                        strogo = false;
                    break;
                case '1':
                    if (curLastIndex != '1')
                        strogo = false;
                    break;
                case '6':
                    if (curLastIndex != '9')
                        strogo = false;
                    break;
                case '9':
                    if (curLastIndex != '6')
                        strogo = false;
                    break;
                case '8':
                    if (curLastIndex != '8')
                        strogo = false;
                    break;
                default:
                    strogo = false;
            }
        }
        if (strogo) {
            System.out.println("Number is strogogrammatic.");
        }
        else {
            System.out.println("Number is not strogogrammatic.");
        }
    }
}
