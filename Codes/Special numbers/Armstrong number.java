// Question: Write a Java program to check if a number is an Armstrong number.

import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num, sum = 0, digits = 0;

        int temp = num;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
        sc.close();
    }
}
