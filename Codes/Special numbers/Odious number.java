// Question: Write a Java program to check if a number is an Odious number.

import java.util.*;

public class OdiousNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int onesCount = Integer.bitCount(n); // counts 1's in binary

        if (onesCount % 2 != 0) {
            System.out.println(n + " is an Odious Number.");
        } else {
            System.out.println(n + " is NOT an Odious Number.");
        }
    }
}
