package test;

import java.util.Scanner;

public class aliceApple {
    static int minApples(int M,int K,int N,int S,int W,int E)
    {
        if(M <= S * K)
            return M;
        else if(M <= S * K + E + W)
            return S * K + (M-S * K) * K;
        else
            return -1;
    }

    public static void main(String[] args)
    {
        int M, K, N, S, W, E;
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        K = sc.nextInt();
        N = sc.nextInt();
        S = sc.nextInt();
        W = sc.nextInt();
        E = sc.nextInt();

        int ans = minApples(M,K,N,S,W,E);
        System.out.println(ans);
    }
}