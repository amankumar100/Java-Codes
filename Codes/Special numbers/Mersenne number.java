// Question: Write a Java program to check if a number is an Mersenne number.

import java.util.*;

public class MersenneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean isMersenne = false;
        int p = 1;

        while ((1 << p) - 1 <= n) { // (1 << p) means 2^p
            if ((1 << p) - 1 == n) {
                isMersenne = true;
                break;
            }
            p++;
        }

        if (isMersenne) {
            System.out.println(n + " is a Mersenne Number.");
        } else {
            System.out.println(n + " is NOT a Mersenne Number.");
        }
    }
}
