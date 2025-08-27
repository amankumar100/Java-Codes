// Question: Write a Java program to validate ISBN-10 or ISBN-13 strings (with or without hyphens).

import java.util.*;

public class ISBNValidator {
    private static String clean(String s) { return s.replaceAll("[-\\s]", ""); }

    private static boolean isISBN10(String s) {
        if (s.length() != 10) return false;
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            if (!Character.isDigit(s.charAt(i))) return false;
            sum += (i + 1) * (s.charAt(i) - '0');
        }
        char last = s.charAt(9);
        int val = (last == 'X' || last == 'x') ? 10 : (Character.isDigit(last) ? last - '0' : -1);
        if (val < 0) return false;
        sum += 10 * val;
        return sum % 11 == 0;
    }

    private static boolean isISBN13(String s) {
        if (s.length() != 13 || !s.chars().allMatch(Character::isDigit)) return false;
        int sum = 0;
        for (int i = 0; i < 13; i++) {
            int d = s.charAt(i) - '0';
            sum += (i % 2 == 0) ? d : 3 * d;
        }
        return sum % 10 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ISBN: ");
        String in = clean(sc.nextLine());

        if (isISBN10(in)) {
            System.out.println("Valid ISBN-10");
        } else if (isISBN13(in)) {
            System.out.println("Valid ISBN-13");
        } else {
            System.out.println("Invalid ISBN");
        }
        sc.close();
    }
}
