// Question: Write a Java program to check if two numbers are Friendly Pair (Amicable).

import java.util.*;

public class FriendlyPair {
    public static int sumOfDivisors(int n) {
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (sumOfDivisors(a) == b && sumOfDivisors(b) == a) {
            System.out.println(a + " and " + b + " are Friendly Pair numbers.");
        } else {
            System.out.println(a + " and " + b + " are not Friendly Pair numbers.");
        }
        sc.close();
    }
}
