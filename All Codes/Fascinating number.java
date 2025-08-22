// Question: Write a Java program to check if a number is a Fascinating number.

import java.util.*;

public class FascinatingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (at least 3 digits): ");
        int num = sc.nextInt();

        String result = "" + num + (num * 2) + (num * 3);

        boolean[] digits = new boolean[10];
        for (char c : result.toCharArray()) {
            int d = c - '0';
            digits[d] = true;
        }

        boolean fascinating = true;
        for (int i = 1; i <= 9; i++) {
            if (!digits[i]) {
                fascinating = false;
                break;
            }
        }

        if (fascinating && result.length() == 9) {
            System.out.println(num + " is a Fascinating number.");
        } else {
            System.out.println(num + " is not a Fascinating number.");
        }
        sc.close();
    }
}
