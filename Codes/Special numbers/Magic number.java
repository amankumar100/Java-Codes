// Question: Write a Java program to check if a number is a Magic number.

import java.util.*;

public class MagicNumber {
    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = num;
        while (sum > 9) {
            sum = digitSum(sum);
        }

        if (sum == 1) {
            System.out.println(num + " is a Magic number.");
        } else {
            System.out.println(num + " is not a Magic number.");
        }
        sc.close();
    }
}
