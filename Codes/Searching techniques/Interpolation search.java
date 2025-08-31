// Question: Write a Java program to implement Interpolation Search.

import java.util.*;

public class InterpolationSearch {
    public static int interpolationSearch(int arr[], int x) {
        int low = 0, high = arr.length - 1;

        while (low <= high && x >= arr[low] && x <= arr[high]) {
            if (low == high) {
                if (arr[low] == x) return low;
                return -1;
            }
            int pos = low + (((x - arr[low]) * (high - low)) / 
                             (arr[high] - arr[low]));

            if (arr[pos] == x) return pos;

            if (arr[pos] < x) low = pos + 1;
            else high = pos - 1;
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

        int result = interpolationSearch(arr, x);
        if (result != -1)
            System.out.println("Element found at index " + result);
        else
            System.out.println("Element not found.");
        sc.close();
    }
}
