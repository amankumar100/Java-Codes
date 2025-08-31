// Question: Write a Java program to count the number of words in a given string.

import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine().trim();

        if (str.isEmpty()) {
            System.out.println("Word count: 0");
        } else {
            String[] words = str.split("\\s+");
            System.out.println("Word count: " + words.length);
        }
        sc.close();
    }
}
