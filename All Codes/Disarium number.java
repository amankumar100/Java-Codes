// Question: Write a Java program to check if a number is a Disarium number.

import java.util.*;

public class DisariumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String s = String.valueOf(num);
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            sum += Math.pow(digit, i + 1);
        }

        if (sum == num) {
            System.out.println(num + " is a Disarium number.");
        } else {
            System.out.println(num + " is not a Disarium number.");
        }
        sc.close();
    }
}
