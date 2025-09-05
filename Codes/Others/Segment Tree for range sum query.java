// Question: Write a Java program to implement Segment Tree for Range Sum Query.

import java.util.*;

public class SegmentTree {
    int tree[];
    int n;

    SegmentTree(int arr[], int n) {
        this.n = n;
        tree = new int[4 * n];
        build(arr, 1, 0, n - 1);
    }

    void build(int arr[], int node, int start, int end) {
        if (start == end) tree[node] = arr[start];
        else {
            int mid = (start + end) / 2;
            build(arr, 2 * node, start, mid);
            build(arr, 2 * node + 1, mid + 1, end);
            tree[node] = tree[2 * node] + tree[2 * node + 1];
        }
    }

    int query(int node, int start, int end, int l, int r) {
        if (r < start || end < l) return 0;
        if (l <= start && end <= r) return tree[node];
        int mid = (start + end) / 2;
        int p1 = query(2 * node, start, mid, l, r);
        int p2 = query(2 * node + 1, mid + 1, end, l, r);
        return p1 + p2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        SegmentTree st = new SegmentTree(arr, n);
        System.out.print("Enter query range (l r): ");
        int l = sc.nextInt(), r = sc.nextInt();
        System.out.println("Sum = " + st.query(1, 0, n - 1, l, r));
        sc.close();
    }
}
