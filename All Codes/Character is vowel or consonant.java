// Question: Write a Java program to check if an entered character is a vowel or consonant.

import java.util.*;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single alphabet: ");
        char ch = sc.next().toLowerCase().charAt(0);

        if (!Character.isLetter(ch)) {
            System.out.println("Invalid input. Please enter an alphabet.");
        } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }
        sc.close();
    }
}
