// Question: Write a Java program to check if a number is a Happy number.

import java.util.*;

public class HappyNumber {
    public static int sumOfSquares(int n) {
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
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
        } while (slow != fast);

        if (slow == 1) {
            System.out.println(num + " is a Happy number.");
        } else {
            System.out.println(num + " is not a Happy number.");
        }
        sc.close();
    }
}
