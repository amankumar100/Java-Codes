// Question: Write a Java program to implement Bucket Sort.

import java.util.*;

public class BucketSort {
    public static void bucketSort(float arr[]) {
        int n = arr.length;
        @SuppressWarnings("unchecked")
        List<Float>[] buckets = new List[n];

        for (int i = 0; i < n; i++) buckets[i] = new ArrayList<>();

        for (float num : arr) {
            int index = (int) (num * n);
            buckets[index].add(num);
        }

        for (List<Float> bucket : buckets) Collections.sort(bucket);

        int idx = 0;
        for (List<Float> bucket : buckets)
            for (float num : bucket)
                arr[idx++] = num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        float arr[] = new float[n];

        System.out.println("Enter elements (between 0 and 1):");
        for (int i = 0; i < n; i++) arr[i] = sc.nextFloat();

        bucketSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        sc.close();
    }
}
