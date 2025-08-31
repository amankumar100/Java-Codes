// Question: Write a Java program to check if a number is an Composite number.

import java.util.*;

public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println(n + " is neither prime nor composite.");
            return;
        }

        boolean isComposite = false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isComposite = true;
                break;
            }
        }

        if (isComposite) {
            System.out.println(n + " is a Composite Number.");
        } else {
            System.out.println(n + " is NOT a Composite Number (It is Prime).");
        }
    }
}
