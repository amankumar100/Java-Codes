// Question: Write a Java program to solve Egg Dropping Puzzle using DP.

import java.util.*;

public class EggDropping {
    static int eggDrop(int n, int k) {
        int dp[][] = new int[n + 1][k + 1];
        int res;

        for (int i = 1; i <= n; i++) {
            dp[i][0] = 0;
            dp[i][1] = 1;
        }
        for (int j = 1; j <= k; j++) dp[1][j] = j;

        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= k; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int x = 1; x <= j; x++) {
                    res = 1 + Math.max(dp[i - 1][x - 1], dp[i][j - x]);
                    if (res < dp[i][j]) dp[i][j] = res;
                }
            }
        }
        return dp[n][k];
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of eggs: ");
        int n = sc.nextInt();
        System.out.print("Enter number of floors: ");
        int k = sc.nextInt();

        System.out.println("Minimum trials needed: " + eggDrop(n, k));
        sc.close();
    }
}
