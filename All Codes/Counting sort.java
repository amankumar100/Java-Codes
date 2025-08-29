// Question: Write a Java program to implement Counting Sort.

import java.util.*;

public class CountingSort {
    public static void countingSort(int arr[]) {
        int n = arr.length;
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int range = max - min + 1;

        int count[] = new int[range];
        int output[] = new int[n];

        for (int i = 0; i < n; i++) count[arr[i] - min]++;
        for (int i = 1; i < count.length; i++) count[i] += count[i - 1];

        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        for (int i = 0; i < n; i++) arr[i] = output[i];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        countingSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        sc.close();
    }
}
