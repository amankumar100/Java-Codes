// Question: Write a Java program to implement Ternary Search.

import java.util.*;

public class TernarySearch {
    public static int ternarySearch(int arr[], int left, int right, int x) {
        if (right >= left) {
            int mid1 = left + (right - left) / 3;
            int mid2 = right - (right - left) / 3;

            if (arr[mid1] == x) return mid1;
            if (arr[mid2] == x) return mid2;

            if (x < arr[mid1]) return ternarySearch(arr, left, mid1 - 1, x);
            else if (x > arr[mid2]) return ternarySearch(arr, mid2 + 1, right, x);
            else return ternarySearch(arr, mid1 + 1, mid2 - 1, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter element to search: ");
        int x = sc.nextInt();

        int result = ternarySearch(arr, 0, n - 1, x);
        if (result != -1)
            System.out.println("Element found at index " + result);
        else
            System.out.println("Element not found.");
        sc.close();
    }
}
