// Question: Write a Java program to implement Fenwick Tree for prefix sums.

import java.util.*;

public class FenwickTree {
    int BIT[];
    int n;

    FenwickTree(int n) {
        this.n = n;
        BIT = new int[n + 1];
    }

    void update(int index, int val) {
        for (; index <= n; index += index & -index)
            BIT[index] += val;
    }

    int query(int index) {
        int sum = 0;
        for (; index > 0; index -= index & -index)
            sum += BIT[index];
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        FenwickTree ft = new FenwickTree(n);
        int arr[] = new int[n + 1];
        System.out.println("Enter elements:");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
            ft.update(i, arr[i]);
        }

        System.out.print("Enter prefix sum index: ");
        int idx = sc.nextInt();
        System.out.println("Prefix Sum = " + ft.query(idx));
        sc.close();
    }
}
