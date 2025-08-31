// Question: Write a Java program to check if a number is a Tech number.

import java.util.*;

public class TechNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String s = String.valueOf(num);
        if (s.length() % 2 != 0) {
            System.out.println(num + " is not a Tech number (odd digits).");
            return;
        }

        int half = s.length() / 2;
        int first = Integer.parseInt(s.substring(0, half));
        int second = Integer.parseInt(s.substring(half));

        int sum = first + second;

        if (sum * sum == num) {
            System.out.println(num + " is a Tech number.");
        } else {
            System.out.println(num + " is not a Tech number.");
        }
        sc.close();
    }
}
