// Question: Write a Java program to check if a number is a Sad number.

import java.util.*;

public class SadNumber {
    public static int digitSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int slow = num, fast = num;
        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(digitSquareSum(fast));
        } while (slow != fast);

        if (slow != 1) {
            System.out.println(num + " is a Sad number.");
        } else {
            System.out.println(num + " is not a Sad number.");
        }
        sc.close();
    }
}
