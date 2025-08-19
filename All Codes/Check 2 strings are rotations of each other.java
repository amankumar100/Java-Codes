// Question: Write a Java program to check if one string is a rotation of another.

import java.util.*;

public class StringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        if (s1.length() == s2.length() && (s1 + s1).contains(s2)) {
            System.out.println(s2 + " is a rotation of " + s1);
        } else {
            System.out.println(s2 + " is not a rotation of " + s1);
        }
        sc.close();
    }
}
