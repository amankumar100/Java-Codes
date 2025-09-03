// Question: Write a Java program to solve 0/1 Knapsack Problem using DP.

import java.util.*;

public class Knapsack01 {
    static int knapSack(int W, int wt[], int val[], int n) {
        int dp[][] = new int[n + 1][W + 1];

        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (i == 0 || w == 0) dp[i][w] = 0;
                else if (wt[i - 1] <= w)
                    dp[i][w] = Math.max(val[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w]);
                else
                    dp[i][w] = dp[i - 1][w];
            }
        }
        return dp[n][W];
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        int val[] = new int[n];
        int wt[] = new int[n];
        System.out.println("Enter values:");
        for (int i = 0; i < n; i++) val[i] = sc.nextInt();
        System.out.println("Enter weights:");
        for (int i = 0; i < n; i++) wt[i] = sc.nextInt();
        System.out.print("Enter max weight capacity: ");
        int W = sc.nextInt();

        System.out.println("Maximum profit: " + knapSack(W, wt, val, n));
        sc.close();
    }
}
