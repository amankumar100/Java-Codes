// Question: Write a Java program to check if a given string is a palindrome, ignoring case and spaces.

import java.util.*;

public class PalindromeChecker {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("\\s+", "").toLowerCase();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
        sc.close();
    }
}
