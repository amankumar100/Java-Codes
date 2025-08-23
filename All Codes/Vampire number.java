// Question: Write a Java program to check if a number is a Vampire number.

import java.util.*;

public class VampireNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        String s = String.valueOf(num);
        int len = s.length();
        if (len % 2 != 0) {
            System.out.println(num + " is not a Vampire number (odd digits).");
            return;
        }

        boolean vampire = false;
        long low = (long)Math.pow(10, len/2 - 1);
        long high = (long)Math.pow(10, len/2);

        for (long i = low; i < high; i++) {
            if (num % i == 0) {
                long j = num / i;
                if (String.valueOf(i).length() == len/2 && String.valueOf(j).length() == len/2) {
                    char[] original = s.toCharArray();
                    char[] combined = (String.valueOf(i) + String.valueOf(j)).toCharArray();
                    Arrays.sort(original);
                    Arrays.sort(combined);
                    if (Arrays.equals(original, combined)) {
                        vampire = true;
                        break;
                    }
                }
            }
        }

        if (vampire) {
            System.out.println(num + " is a Vampire number.");
        } else {
            System.out.println(num + " is not a Vampire number.");
        }
        sc.close();
    }
}
